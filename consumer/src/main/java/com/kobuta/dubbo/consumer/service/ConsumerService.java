package com.kobuta.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kobuta.dubbo.api.service.UserService;
import com.kobuta.dubbo.api.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @Reference
    UserService userService;

    public User saveUser() {
        User user = new User();
        user.setId(1000000);
        return userService.saveUser(user);
    }
}
