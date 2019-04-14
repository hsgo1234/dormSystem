package com.qddx.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description:
 * @Author: HUOHENGTONG
 * @CreateDate: 2019/4/14 16:52
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "topic message"+new Date();
        System.out.println("Sender:"+context);
        this.rabbitTemplate.convertAndSend("exchange","topic.q",context);
    }
}
