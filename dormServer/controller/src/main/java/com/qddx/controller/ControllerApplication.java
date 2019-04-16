package com.qddx.controller;

import com.qddx.dao.PersonMapper;
import com.qddx.dao.UserInfoMapper;
import com.qddx.domain.Person;
import com.qddx.domain.UserInfo;
import com.qddx.service.HelloSender;
import com.qddx.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
public class ControllerApplication {
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private HelloSender helloSender;
    @Autowired
    private MailServiceImpl mailService;
    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping("/insert")
    public Integer save(){
        Person person = new Person();
        person.setName("小花");
        person.setAge(15);
        personMapper.insert(person);
        return person.getId();
    }

    @RequestMapping("/selectAll")
    public List<Person> selectAll(){
        return personMapper.selectAll();
    }

    @RequestMapping("/rabbitmq")
    public void rabbitMQ(){
        helloSender.send();
    }

    @RequestMapping("/sendmail")
    public void sendMail() throws Exception{
        String context = "现在时间"+new Date();
        mailService.sendSimpleMail("997922078@qq.com","测试一下",context);
    }

    @RequestMapping(value = "/userAll")
    public UserInfo login(){
        return userInfoMapper.findByUsername("admin");
    }
}