package com.mutiny.moscacal;

import com.mutiny.moscacal.dao.ModuleMapper;
import com.mutiny.moscacal.mail.EmailService;
import com.mutiny.moscacal.mail.MailBean;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/17 17:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MoscaCalApplicationTests {
    @Autowired
    private ModuleMapper moduleMapper;
    @Autowired
    private EmailService emailService;

    @org.junit.Test
    public void testDataBase(){
        MailBean mailBean = new MailBean();
        mailBean.setRecipient("sunmengda@outlook.com");
        mailBean.setContent("hi");
        mailBean.setSubject("TestMail");
        emailService.sendHTMLMail(mailBean);
//        emailService.sendSimpleMail(mailBean);
//        System.out.println(moduleMapper.selectByPrimaryKey(21));
    }
}
