package com.qddx.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ControllerApplication {

    @RequestMapping("/")
    String yiu(){
        return "ahsjdahkahdka";
    }

    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class, args);
    }

}
