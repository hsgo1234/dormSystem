package com.qddx.controller;

import com.qddx.dao.*;
import com.qddx.domain.*;
import com.qddx.service.HelloSender;
import com.qddx.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private LogInfoMapper logInfoMapper;

    @RequestMapping("/login")
    public String login(@RequestBody LogInfo logInfo){
        String username = logInfo.getUsername();
        String password = logInfo.getPassword();
        Teacher teacher = teacherMapper.selectByTeaName(username);
        if (teacher==null){
            System.out.println("用户名不存在");
            return "用户名不存在";
        }else {
            LogInfo logInfo1 =logInfoMapper.selcetByUserName(username);
            if (logInfo1.getPassword().equals(password)){
                System.out.println("success");
                return "success";
            }else {
                System.out.println("密码错误");
                return "密码错误";
            }
        }
    }

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

    @RequestMapping(value = "test")
    public Person  test(@RequestBody Person person){
        System.out.println(person.toString());
        return person;
    }
}