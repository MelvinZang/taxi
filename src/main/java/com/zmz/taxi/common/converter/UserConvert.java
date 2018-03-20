package com.zmz.taxi.common.converter;

import com.zmz.taxi.bo.req.LoginReq;
import com.zmz.taxi.bo.req.RegisterReq;
import com.zmz.taxi.dao.domain.User;
import org.springframework.util.StringUtils;

public class UserConvert {

    public static User RegisterReqConvert(RegisterReq registerReq){
        User user = new User();
        if (!StringUtils.isEmpty(registerReq.getAccount())){
            user.setAccount(registerReq.getAccount());
        }
        if (!StringUtils.isEmpty(registerReq.getPassword())){
            user.setPassword(registerReq.getPassword());
        }
        if (!StringUtils.isEmpty(registerReq.getNickname())){
            user.setNickname(registerReq.getNickname());
        }
        if (!StringUtils.isEmpty(registerReq.getType())){
            user.setType(registerReq.getType());
        }
        return user;
    }

    public static User loginReqConvert(LoginReq loginReq){
        User user = new User();
        if(!StringUtils.isEmpty(loginReq.getAccount())){
            user.setAccount(loginReq.getAccount());
        }
        if(!StringUtils.isEmpty(loginReq.getPassword())){
            user.setPassword(loginReq.getPassword());
        }
        return user;
    }

}
