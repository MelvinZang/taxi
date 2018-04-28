package com.zmz.taxi.service;

import com.zmz.taxi.bo.req.ApplyOrderReq;
import com.zmz.taxi.bo.req.CheckWaitingAccessReq;
import com.zmz.taxi.bo.res.BaseRes;
import com.zmz.taxi.bo.res.QueryRes;
import com.zmz.taxi.dao.domain.ApplyOrder;

import javax.management.Query;
import java.util.List;

public interface ApplyOrderService {
    QueryRes<ApplyOrder> saveApplyOrder(ApplyOrderReq applyOrderReq);

    QueryRes<ApplyOrder> checkIsShow(CheckWaitingAccessReq checkWaitingAccessReq);

    BaseRes updateApplyOrder(ApplyOrder applyOrder);

    QueryRes<List<ApplyOrder>> checkApplyOrder();

}
