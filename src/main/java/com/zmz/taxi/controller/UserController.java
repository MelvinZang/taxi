package com.zmz.taxi.controller;

import com.zmz.taxi.bo.req.RegisterReq;
import com.zmz.taxi.dao.domain.User;
import com.zmz.taxi.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
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
    public String register(@RequestBody RegisterReq registerReq) {
        System.out.println(registerReq);
        //userService.register(user);
        return registerReq.getAccount();
    }
}
