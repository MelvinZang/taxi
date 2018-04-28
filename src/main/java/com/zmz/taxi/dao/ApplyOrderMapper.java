package com.zmz.taxi.dao;

import com.zmz.taxi.dao.domain.ApplyOrder;

import java.util.List;

public interface ApplyOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApplyOrder record);

    int insertSelective(ApplyOrder record);

    ApplyOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApplyOrder record);

    int updateByPrimaryKey(ApplyOrder record);

    ApplyOrder selectByUserCustomerAndIsShow(ApplyOrder applyOrder);

    List<ApplyOrder> selectByIsShow();

}