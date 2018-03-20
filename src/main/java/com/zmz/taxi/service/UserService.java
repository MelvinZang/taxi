package com.zmz.taxi.service;

import com.zmz.taxi.bo.res.BaseRes;
import com.zmz.taxi.dao.domain.User;

public interface UserService {

    public BaseRes register(User user);

    public BaseRes login(User user);
}
