package com.qddx.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: HUOHENGTONG
 * @CreateDate: 2019/4/14 16:56
 */
@Component
public class HelloReceiver {
    @RabbitListener(queues = "topic.message")
    public void process(String message){
        System.out.println("Receiver:"+message);
    }
}
