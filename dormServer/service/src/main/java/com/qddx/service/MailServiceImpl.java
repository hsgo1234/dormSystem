package com.qddx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;



/**
 * @Description:
 * @Author: HUOHENGTONG
 * @CreateDate: 2019/4/14 19:43
 */
@Component
public class MailServiceImpl {
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String Sender;

    public void sendSimpleMail(String to,String subject,String content){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(Sender);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);

        try {
            mailSender.send(message);
            System.out.println("...send is over.."+Sender+"+"+to+"+"+subject+"+"+content);
        }catch (Exception e){
            System.out.println("error: "+e);
        }
    }
}
