package com.zmz.taxi.service.serviceImpl;

import com.zmz.taxi.bo.req.HistoryReq;
import com.zmz.taxi.bo.res.BaseRes;
import com.zmz.taxi.bo.res.QueryRes;
import com.zmz.taxi.dao.OrderMapper;
import com.zmz.taxi.dao.domain.Order;
import com.zmz.taxi.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

import static com.zmz.taxi.common.constant.HTTPConstants.SAVE_ORDER_FAIL;
import static com.zmz.taxi.common.constant.HTTPConstants.SAVE_ORDER_SUCCESS;

@Service("OrderService")
public class OrderServiceImpl implements OrderService{

    @Resource
    private OrderMapper orderMapper;

    @Override
    public BaseRes saveOrder(Order order) {
        BaseRes baseRes;
        try{
            System.out.println(order);
            orderMapper.insert(order);
            baseRes = BaseRes.getSuccess(SAVE_ORDER_SUCCESS);
        }
        catch (Exception e){
            System.out.println(e);
            baseRes = BaseRes.getError(SAVE_ORDER_FAIL);
        }

        return baseRes;
    }

    @Override
    public QueryRes<List<Order>> checkHistory(HistoryReq historyReq) {
        QueryRes<List<Order>> queryRes = new QueryRes<>();

        List<Order> orderData;
        try{
            if (historyReq.getType().equals("1")){
                orderData = orderMapper.selectByCustomerAccount(historyReq.getAccount());
            }else {
                orderData = orderMapper.selectByDriverAccount(historyReq.getAccount());
            }
            queryRes.setSuccessRes("query success");
            if (orderData != null){
                queryRes.setData(orderData);
            }


        }
        catch (Exception e){
            System.out.println(e);
            queryRes.setErrorCodeOneRes("查询历史记录错误");
        }




        return queryRes;
    }
}
