package com.mutiny.moscacal.Component;

import com.mutiny.moscacal.dao.FileAnswerMapper;
import com.mutiny.moscacal.dao.UserMapper;
import com.mutiny.moscacal.dto.CalDefaultDataInfo;
import com.mutiny.moscacal.dto.CalModuleInfo;
import com.mutiny.moscacal.mail.EmailService;
import com.mutiny.moscacal.mail.MailBean;
import com.mutiny.moscacal.pojo.FileAnswer;
import com.mutiny.moscacal.pojo.User;
import com.mutiny.moscacal.util.CSVUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/17 16:18
 */
@Component
public class CountThread {
    @Value("${cal.count}")
    private int count;
    @Autowired
    private RunCal runCal;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private EmailService emailService;
    public Boolean canBeRun() {
        if (RunCal.getCount()<count){
            return true;
        }
        return false;
    }

    public void emailStartSend(String username,int ModuleId){
        MailBean mailBean = new MailBean();
        User user = userMapper.selectByPrimaryKey(username);
        mailBean.setRecipient(user.getEmail());
        mailBean.setSubject("CalCulate Start");
        mailBean.setContent("您提交的关于Module(ID="+ModuleId+")已经开始计算，计算完毕后会以邮件的形式通知您，感谢您对我们平台的支持");
        emailService.sendHTMLMail(mailBean);
    }

    public void runModule(CalModuleInfo calModuleInfo) throws Exception{
        if (!canBeRun()){
            throw new Exception("The Running Module is full");
        }
        runCal.runModule(calModuleInfo);
        emailStartSend(calModuleInfo.getUsername(),calModuleInfo.getModuleId());
    }

    public void runDefaultData(CalDefaultDataInfo calDefaultDataInfo) throws Exception{
        if (!canBeRun()){
            throw new Exception("The Running Module is full");
        }
        runCal.runDefaultData(calDefaultDataInfo);
        emailStartSend(calDefaultDataInfo.getUsername(),calDefaultDataInfo.getModuleId());
    }
}
