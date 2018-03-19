package com.zmz.taxi.service.serviceImpl;

import com.zmz.taxi.dao.UserMapper;
import com.zmz.taxi.dao.domain.User;
import com.zmz.taxi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        int i = userMapper.insert(user);
        return i;
    }
}
