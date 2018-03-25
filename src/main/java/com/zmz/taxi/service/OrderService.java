package com.zmz.taxi.service;


import com.zmz.taxi.bo.req.HistoryReq;
import com.zmz.taxi.bo.res.BaseRes;
import com.zmz.taxi.bo.res.QueryRes;
import com.zmz.taxi.dao.domain.Order;

import java.util.List;

public interface OrderService {

    BaseRes saveOrder(Order order);

    QueryRes<List<Order>> checkHistory(HistoryReq historyReq);
}
