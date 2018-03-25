package com.zmz.taxi.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.zmz.taxi.bo.res.BaseRes;
import com.zmz.taxi.dao.UserMapper;
import com.zmz.taxi.dao.domain.User;
import com.zmz.taxi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.zmz.taxi.common.constant.HTTPConstants.*;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public BaseRes register(User user) {
        BaseRes baseRes;
        try{
            if(userMapper.selectByAccount(user.getAccount()) == null){
                userMapper.insert(user);
                baseRes = BaseRes.getSuccess(REGISTER_SUCCESS);
            }else{
                baseRes = BaseRes.getError(REGISTER_DUPLICATED);
            }

        }
        catch (Exception e){
            System.out.println("写数据库失败");
            baseRes = BaseRes.getError(HTTP_FAIL);
        }

        return baseRes;
    }

    @Override
    public BaseRes login(User user) {
        BaseRes baseRes;
        try{
            User userBase = userMapper.selectByAccount(user.getAccount());
            if(userBase != null){
                if (user.getPassword().equals(userBase.getPassword())){
                    baseRes = BaseRes.getSuccess(LOGIN_SUCCESS);
                    baseRes.setReturnMessage(JSON.toJSONString(userBase));
                }else{
                    baseRes = BaseRes.getError(LOGIN_PASSWORD_WRONG);
                }
            }else{
                baseRes = BaseRes.getError(LOGIN_USER_NOT_FOUND);
            }
        }catch(Exception e){
            System.out.println("查数据库失败");
            baseRes = BaseRes.getError(HTTP_FAIL);
        }
        return baseRes;
    }


}
