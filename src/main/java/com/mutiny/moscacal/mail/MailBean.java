package com.mutiny.moscacal.mail;

import java.io.Serializable;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/20 15:31
 */
public class MailBean implements Serializable {
    private String recipient;
    private String subject;
    private String content;

    @Override
    public String toString() {
        return "MailBean{" +
                "recipient='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public MailBean() {
    }

    public MailBean(String recipient, String subject, String content) {
        this.recipient = recipient;
        this.subject = subject;
        this.content = content;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
