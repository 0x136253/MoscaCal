package com.mutiny.moscacal.Component;

import com.mutiny.moscacal.FHE.EncryptDecrypt;
import com.mutiny.moscacal.FHE.Key;
import com.mutiny.moscacal.FHE.RecursiveDescent;
import com.mutiny.moscacal.dao.DefaultDataMapper;
import com.mutiny.moscacal.dao.FileAnswerMapper;
import com.mutiny.moscacal.dao.ModuleMapper;
import com.mutiny.moscacal.dao.UserMapper;
import com.mutiny.moscacal.dto.CalDefaultDataInfo;
import com.mutiny.moscacal.dto.CalModuleInfo;
import com.mutiny.moscacal.mail.EmailService;
import com.mutiny.moscacal.mail.MailBean;
import com.mutiny.moscacal.message.MessageSender;
import com.mutiny.moscacal.pojo.*;
import com.mutiny.moscacal.util.CSVUtils;
import com.mutiny.moscacal.util.RecursiveDescentUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.*;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/17 16:21
 */
@Component
public class RunCal{
    private Logger logger = LoggerFactory.getLogger(RunCal.class);

    private static int count=0;
    @Autowired
    private FileAnswerMapper fileAnswerMapper;
    @Autowired
    private DefaultDataMapper defaultDataMapper;
    @Autowired
    private ModuleMapper moduleMapper;
    @Autowired
    private FilePath filePath;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MessageSender messageSender;
    @Autowired
    private EmailService emailService;
    public static int getCount() {
        return count;
    }

    @Async
    public void runDefaultData(CalDefaultDataInfo calDefaultDataInfo){
        count++;
        Map<Character, BigInteger>[] calMap = new HashMap[calDefaultDataInfo.getSize()];
        Map<String, List<String>> InfoMap = new HashMap<>();
        Boolean sDefault = true;
        int id = calDefaultDataInfo.getModuleId();
        Key key = calDefaultDataInfo.getKey();
        String func = calDefaultDataInfo.getFunc();
        Map<String,List<String>> map = calDefaultDataInfo.getMap();

        List<BigInteger> answer = Run(calMap,InfoMap,map,key,func);

        DefaultData defaultData = calDefaultDataInfo.getDefaultData();
        DefaultModule defaultModule = calDefaultDataInfo.getDefaultModule();
        int FileID = saveAnsw(Sysnis(InfoMap,answer),filePath.returnBasicPath()+"Answ//","None",defaultData.getKeyfileid(),0,defaultModule.getMultnum());

        defaultData.setFileaswid(FileID);
        defaultData.setIsCalculate(true);
        ModuleExample moduleExample = new ModuleExample();
        moduleExample.createCriteria().andIsDefaultEqualTo(true).andDefaultmoduleIdEqualTo(defaultData.getDefaultmoduleId());
        List<Module> updateModuleList = moduleMapper.selectByExample(moduleExample);
        for(Module record:updateModuleList){
            Module module = new Module();
            module.setModuleId(record.getModuleId());
            module.setIsCalculate(true);
            moduleMapper.updateByPrimaryKeySelective(module);
        }
        defaultDataMapper.updateByPrimaryKeySelective(defaultData);
        emailStartSend(calDefaultDataInfo.getUsername(),id);
        try {
            Thread.sleep(5000);
            messageSender.sendPrivate("Calculate","The Calculate your apply hava complete.",calDefaultDataInfo.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
        }
        count--;
        return;
    }

    @Async
    public void runModule(CalModuleInfo calModuleInfo){
        count++;
        Map<Character, BigInteger>[] calMap = new HashMap[calModuleInfo.getSize()];
        Map<String, List<String>> InfoMap = new HashMap<>();
        Boolean sDefault = false;
        int id = calModuleInfo.getModuleId();
        Key key = calModuleInfo.getKey();
        String func = calModuleInfo.getFunc();
        Map<String,List<String>> map = calModuleInfo.getMap();

        List<BigInteger> answer = Run(calMap,InfoMap,map,key,func);

        Module module = calModuleInfo.getModule();
        int FileID = saveAnsw(Sysnis(InfoMap,answer),filePath.returnBasicPath()+"Answ//","None",module.getKeyfileid(),id,module.getMultnum());
        module.setIsCalculate(true);
        moduleMapper.updateByPrimaryKeySelective(module);
        emailStartSend(calModuleInfo.getUsername(),id);
        try {
            Thread.sleep(5000);
            messageSender.sendPrivate("Calculate","The Calculate your apply hava complete.",calModuleInfo.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
        }
        count--;
        return;
    }

    public void emailStartSend(String username,int ModuleId){
        MailBean mailBean = new MailBean();
        User user = userMapper.selectByPrimaryKey(username);
        mailBean.setRecipient(user.getEmail());
        mailBean.setSubject("CalCulate Complete");
        mailBean.setContent("您提交的关于Module(ID="+ModuleId+")已经计算完毕，现在您可前往平台查看结果，感谢您对我们平台的支持");
        emailService.sendHTMLMail(mailBean);
    }

    public Map<String,List<String> > Sysnis(Map<String, List<String>> infoMap,List<BigInteger> answer){
        List<String>  moduleansw = new ArrayList<>();
        for(BigInteger record : answer){
            moduleansw.add(record.toString());
        }
        infoMap.put("answ",moduleansw);
        return infoMap;
    }

    public Map<Character,BigInteger> decode(Map<Character, BigInteger> map,Key key){
        Iterator<Character> keySet = map.keySet().iterator();
        Map<Character, BigInteger> answ = new HashMap<>();
        while (keySet.hasNext()){
            Character keys = keySet.next();
            answ.put(keys,EncryptDecrypt.decryption(map.get(keys),key));
        }
        return answ;
    }

    public List<BigInteger> Run(Map<Character, BigInteger>[] calMap,
                    Map<String, List<String>> InfoMap,
                    Map<String,List<String>> map,
                    Key key,
                    String func){
        Set<String> keySet = map.keySet();
        Iterator<String> itKeySet = keySet.iterator();
        while (itKeySet.hasNext()){
            String k = itKeySet.next();
            if (k.length()==1){
                List<String> val = map.get(k);
                int length = val.size();
                for (int i=0;i<length;i++){
                    if (calMap[i]==null){
                        calMap[i]= new HashMap<>();
                    }
                    calMap[i].put(k.charAt(0),new BigInteger(val.get(i)));
                }
            }else {
                InfoMap.put(k,map.get(k));
            }
        }
        List<BigInteger> answer = new ArrayList<>();
        for (int i =0;i<calMap.length;i++){
            RecursiveDescentUtils recursiveDescentUtils = new RecursiveDescentUtils(func,decode(calMap[i],key));
            System.out.println(recursiveDescentUtils.exp());
            RecursiveDescent recursiveDescent = new RecursiveDescent(func,calMap[i],key);
            answer.add(EncryptDecrypt.decryption(recursiveDescent.exp(),key));
        }
        System.out.println("Run Success");
        return answer;
    }

    public int saveAnsw(Map<String,List<String>> map,String path,String Algo,int KeyFileId,int moduleid,int Multnum){
        String savePath = CSVUtils.writeCsvFile(path,map);
        FileAnswerExample fileAnswerExample = new FileAnswerExample();
        fileAnswerExample.createCriteria();
        int size = fileAnswerMapper.selectByExample(fileAnswerExample).size();
        FileAnswer fileAnswer = new FileAnswer();
        fileAnswer.setFileId(size+1);
        fileAnswer.setEncodeAlgorithm(Algo);
        fileAnswer.setFileUrl(savePath);
        fileAnswer.setGeneratetime(new Date());
        fileAnswer.setKeyfileid(KeyFileId);
        if (moduleid!=0) {
            fileAnswer.setModuleId(moduleid);
        }
        fileAnswer.setMultnum(Multnum);
        fileAnswerMapper.insertSelective(fileAnswer);
        return size+1;
    }
}
