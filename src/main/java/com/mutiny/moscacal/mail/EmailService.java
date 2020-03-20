package com.mutiny.moscacal.mail;

import com.mutiny.moscacal.Component.RunCal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/20 15:22
 */
@Component
public class EmailService {
    private Logger logger = LoggerFactory.getLogger(EmailService.class);
    @Autowired
    private JavaMailSender mailSender;
    @Value("${lance.mail.sender}")
    private String MAIL_SENDER;

    public void sendSimpleMail(MailBean mailBean) {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            //邮件发送人
            simpleMailMessage.setFrom(MAIL_SENDER);
            //邮件接收人
            simpleMailMessage.setTo(mailBean.getRecipient());
            //邮件主题
            simpleMailMessage.setSubject(mailBean.getSubject());
            //邮件内容
            simpleMailMessage.setText(mailBean.getContent());
            mailSender.send(simpleMailMessage);
        } catch (Exception e) {
            logger.error("邮件发送失败", e.getMessage());
        }
    }

    public void sendHTMLMail(MailBean mailBean) {
        MimeMessage mimeMailMessage = null;
        try {
            mimeMailMessage = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);
            mimeMessageHelper.setFrom(MAIL_SENDER);
            mimeMessageHelper.setTo(mailBean.getRecipient());
            mimeMessageHelper.setSubject(mailBean.getSubject());
            StringBuilder sb = new StringBuilder();
            sb.append("<h1 style='text-align:center'>Mosca</h1>")
                    .append("<p style='color:#F00'>"+mailBean.getContent()+"</p>")
                    .append("<p style='text-align:right'>"+new Date() +"</p>");
            mimeMessageHelper.setText(sb.toString(), true);
            mailSender.send(mimeMailMessage);
            logger.info(mailBean+"send success");
        } catch (Exception e) {
            logger.error("邮件发送失败", e.getMessage());
        }
    }



    public void sendMsg() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        // 邮件发送者，这里不能随便填写，必须是真实的发送邮件的邮箱名称
        mailMessage.setFrom("1976437040@qq.com");
        // 邮件接受者
        mailMessage.setTo("sunmengda@outlook.com");
        // 邮件主题
        mailMessage.setSubject("testSubject");
        // 邮件内容
        mailMessage.setText("hello email!");
        // 发送邮件
        mailSender.send(mailMessage);
    }

}
