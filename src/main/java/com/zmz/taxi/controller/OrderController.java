package com.zmz.taxi.controller;

import com.alibaba.fastjson.JSON;
import com.zmz.taxi.bo.req.HistoryReq;
import com.zmz.taxi.bo.req.OrderSaveReq;
import com.zmz.taxi.bo.res.BaseRes;
import com.zmz.taxi.bo.res.QueryRes;
import com.zmz.taxi.common.converter.OrderConvert;
import com.zmz.taxi.dao.domain.Order;
import com.zmz.taxi.service.OrderService;
import com.zmz.taxi.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("save")
    public String login(@RequestBody OrderSaveReq orderSaveReq){
        System.out.println(orderSaveReq);
        Order order = OrderConvert.orderSaveReqConvert(orderSaveReq);
        BaseRes baseRes = orderService.saveOrder(order);
        String res = JSON.toJSONString(baseRes);
        return res;

    }

    @RequestMapping("history")
    public String history(@RequestBody HistoryReq historyReq){
        System.out.println(historyReq);
        QueryRes<List<Order>> baseRes = orderService.checkHistory(historyReq);
        String res = JSON.toJSONString(baseRes);
        System.out.println(res);
        return res;

    }

}
