package com.zmz.taxi.common.converter;

import com.zmz.taxi.bo.req.OrderSaveReq;
import com.zmz.taxi.dao.domain.Order;
import org.springframework.util.StringUtils;

import java.sql.Struct;

public class OrderConvert {

    public static Order orderSaveReqConvert(OrderSaveReq orderSaveReq){
        Order order = new Order();
        if (!StringUtils.isEmpty(orderSaveReq.getUserCustomer())){
            order.setUserCustomer(orderSaveReq.getUserCustomer());
        }
        if (!StringUtils.isEmpty(orderSaveReq.getUserDriver())){
            order.setUserDriver(orderSaveReq.getUserDriver());
        }
        if (!StringUtils.isEmpty(orderSaveReq.getDistanceNumber())){
            order.setDistanceNumber(orderSaveReq.getDistanceNumber());
        }
        if (!StringUtils.isEmpty(orderSaveReq.getPriceNumber())){
            order.setPriceNumber(orderSaveReq.getPriceNumber());
        }
        if (!StringUtils.isEmpty(orderSaveReq.getWaitTimeNumber())){
            order.setWaitTimeNumber(orderSaveReq.getWaitTimeNumber());
        }
        if (!StringUtils.isEmpty(orderSaveReq.getTotalTimeNumber())){
            order.setTotalTimeNumber(orderSaveReq.getTotalTimeNumber());
        }

        return order;
    }

}
