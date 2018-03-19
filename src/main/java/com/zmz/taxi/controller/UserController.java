package com.zmz.taxi.controller;

import com.zmz.taxi.dao.domain.User;
import com.zmz.taxi.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("register")
    public User register() {
        User user = new User();
        user.setAccount("test");
        userService.register(user);
        return user;
    }
}
