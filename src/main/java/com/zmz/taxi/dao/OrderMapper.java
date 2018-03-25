package com.zmz.taxi.dao;

import com.zmz.taxi.dao.domain.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> selectByCustomerAccount(String account);

    List<Order> selectByDriverAccount(String account);
}