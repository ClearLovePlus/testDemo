package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api")
public class TestController {
    @RequestMapping("hello")
    public String test(){
        Random random=new Random();

        boolean tag=random.nextBoolean();
        Number number=(tag||!tag)?new Integer(3):new Long(1);
        System.out.println(number);
        return "hello world";
    }
}
