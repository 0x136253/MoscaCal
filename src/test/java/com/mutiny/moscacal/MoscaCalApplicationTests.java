package com.mutiny.moscacal;

import com.mutiny.moscacal.dao.ModuleMapper;
import com.mutiny.moscacal.dao.UserMapper;
import com.mutiny.moscacal.mail.EmailService;
import com.mutiny.moscacal.mail.MailBean;
import com.mutiny.moscacal.message.*;
import com.mutiny.moscacal.pojo.User;
import com.mutiny.moscacal.pojo.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

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
    @Autowired
    private MessageSender messageSender;
    @Autowired
    private MessageUpdate messageUpdate;
    @Autowired
    private MessageReceiver messageReceiver;
    @Autowired
    private UserMapper userMapper;
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

    @Test
    public void messageSend(){
        UserExample userExample = new UserExample();
        userExample.createCriteria();
        List<User> userList_all = userMapper.selectByExample(userExample);
        userExample.clear();
        userExample.createCriteria().andTypeEqualTo("企业管理员");
        List<User> userList_admin = userMapper.selectByExample(userExample);
        List<User> userList_priavate = new ArrayList<>();
        User user = new User();
        user.setId("Anon");
        userList_priavate.add(user);
        Message message1 = new Message("System Message Test","hello mosca","public");
        Message message2 = new Message("System Message Test","hello admin","group");
        Message message3 = new Message("System Message Test","hello Anon","private");
        try {
            messageSender.sendAll(message1,userList_all);
            messageSender.sendAll(message2,userList_admin);
            messageSender.sendAll(message3,userList_priavate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void messageRe(){
        String username = "Anon";
        try {
//            messageUpdate.deleteMessage("Anon",1);
//            messageUpdate.update("Anon");
//            List<MessageInto> messageIntos = messageReceiver.getMessageSmall("Anon");
//            System.out.println(messageIntos);
            System.out.println(messageReceiver.getMessageBig("Anon",1));
            messageReceiver.deleteMessage("Anon",2);
            System.out.println(messageReceiver.getMessageBig("Anon",2));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
