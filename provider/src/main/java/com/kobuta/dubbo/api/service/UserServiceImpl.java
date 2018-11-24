package com.kobuta.dubbo.api.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.kobuta.dubbo.api.pojo.User;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        int  id = user.getId();
        System.out.println("id is " + id);
        return user;
    }
}
