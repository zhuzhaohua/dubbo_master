package com.kobuta.dubbo.consumer.controller;

import com.kobuta.dubbo.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private ConsumerService service;


    @RequestMapping("/save")
    public Object saveUser() {

        return service.saveUser();
    }

}
