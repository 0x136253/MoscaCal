package com.mutiny.moscacal.Component;

import com.mutiny.moscacal.FHE.EncryptDecrypt;
import com.mutiny.moscacal.FHE.Key;
import com.mutiny.moscacal.FHE.RecursiveDescent;
import com.mutiny.moscacal.dao.FileAnswerMapper;
import com.mutiny.moscacal.dto.CalDefaultDataInfo;
import com.mutiny.moscacal.dto.CalModuleInfo;
import com.mutiny.moscacal.pojo.FileAnswer;
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
    private FilePath filePath;

    public static int getCount() {
        return count;
    }

    @Async
    public boolean runDefaultData(CalDefaultDataInfo calDefaultDataInfo){
        Map<Character, BigInteger>[] calMap = new HashMap[calDefaultDataInfo.getSize()];
        Map<String, List<String>> InfoMap = new HashMap<>();
        Boolean sDefault = true;
        int id = calDefaultDataInfo.getModuleId();
        Key key = calDefaultDataInfo.getKey();
        String func = calDefaultDataInfo.getFunc();
        Map<String,List<String>> map = calDefaultDataInfo.getMap();
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
        count++;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<BigInteger> answer = new ArrayList<>();
        for (int i =0;i<calMap.length;i++){
            RecursiveDescentUtils recursiveDescentUtils = new RecursiveDescentUtils(func,decode(calMap[i],key));
            RecursiveDescent recursiveDescent = new RecursiveDescent(func,calMap[i],key);
            answer.add(EncryptDecrypt.decryption(recursiveDescent.exp(),key));
        }
        System.out.println("Run Success");
        String path = CSVUtils.writeCsvFile(filePath+"Answ//",Sysnis(InfoMap,answer));
        FileAnswer fileAnswer = new FileAnswer();
        count--;
        return true;
    }

    @Async
    public boolean runModule(CalModuleInfo calModuleInfo){
        Map<Character, BigInteger>[] calMap = new HashMap[calModuleInfo.getSize()];
        Map<String, List<String>> InfoMap = new HashMap<>();
        Boolean sDefault = false;
        int id = calModuleInfo.getModuleId();
        Key key = calModuleInfo.getKey();
        String func = calModuleInfo.getFunc();
        Map<String,List<String>> map = calModuleInfo.getMap();
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
        count++;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<BigInteger> answer = new ArrayList<>();
        for (int i =0;i<calMap.length;i++){
            RecursiveDescentUtils recursiveDescentUtils = new RecursiveDescentUtils(func,decode(calMap[i],key));
            RecursiveDescent recursiveDescent = new RecursiveDescent(func,calMap[i],key);
            answer.add(EncryptDecrypt.decryption(recursiveDescent.exp(),key));
        }
        System.out.println("Run Success");
        String path = CSVUtils.writeCsvFile(filePath.returnBasicPath()+"Answ//",Sysnis(InfoMap,answer));
        FileAnswer fileAnswer = new FileAnswer();
        count--;
        return true;
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
        count++;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<BigInteger> answer = new ArrayList<>();
        for (int i =0;i<calMap.length;i++){
            RecursiveDescentUtils recursiveDescentUtils = new RecursiveDescentUtils(func,decode(calMap[i],key));
            RecursiveDescent recursiveDescent = new RecursiveDescent(func,calMap[i],key);
            answer.add(EncryptDecrypt.decryption(recursiveDescent.exp(),key));
        }
        System.out.println("Run Success");
        return answer;
    }
}
