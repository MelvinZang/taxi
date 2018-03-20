package com.zmz.taxi.controller;

import com.alibaba.fastjson.JSON;
import com.zmz.taxi.bo.req.BaseReq;
import com.zmz.taxi.bo.req.LoginReq;
import com.zmz.taxi.bo.req.RegisterReq;
import com.zmz.taxi.bo.res.BaseRes;
import com.zmz.taxi.common.converter.UserConvert;
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
        User user = UserConvert.RegisterReqConvert(registerReq);
        BaseRes baseRes = userService.register(user);
        //userService.register(user);
        return JSON.toJSONString(baseRes);
    }

    @RequestMapping("login")
    public String login(@RequestBody LoginReq loginReq){
        System.out.println(loginReq);
        User user = UserConvert.loginReqConvert(loginReq);
        BaseRes baseRes = userService.login(user);

        return JSON.toJSONString(baseRes);

    }
}
