package com.zmz.taxi.common.converter;

import com.zmz.taxi.bo.req.ApplyOrderReq;
import com.zmz.taxi.bo.req.CheckWaitingAccessReq;
import com.zmz.taxi.dao.domain.ApplyOrder;
import org.springframework.util.StringUtils;

public class ApplyOrderConvert {

    public static ApplyOrder applyOrderReqConvert(ApplyOrderReq applyOrderReq){
        ApplyOrder applyOrder = new ApplyOrder();

        if (!StringUtils.isEmpty(applyOrderReq.getCustomerConfirm())){
            applyOrder.setCustomerConfirm(applyOrderReq.getCustomerConfirm());
        }
        if (!StringUtils.isEmpty(applyOrderReq.getDriverConfirm())){
            applyOrder.setDriverConfirm(applyOrderReq.getDriverConfirm());
        }
        if (!StringUtils.isEmpty(applyOrderReq.getEndLocation())){
            applyOrder.setEndLocation(applyOrderReq.getEndLocation());
        }
        if (!StringUtils.isEmpty(applyOrderReq.getIsShow())){
            applyOrder.setIsShow(applyOrderReq.getIsShow());
        }
        if (!StringUtils.isEmpty(applyOrderReq.getStartLocation())){
            applyOrder.setStartLocation(applyOrderReq.getStartLocation());
        }
        if (!StringUtils.isEmpty(applyOrderReq.getUserCustomer())){
            applyOrder.setUserCustomer(applyOrderReq.getUserCustomer());
        }

        return applyOrder;
    }

    public static ApplyOrder checkWaitingAccessReqConvert(CheckWaitingAccessReq checkWaitingAccessReq){
        ApplyOrder applyOrder = new ApplyOrder();
        if(!StringUtils.isEmpty(checkWaitingAccessReq.getUserAccount())){
            applyOrder.setUserCustomer(checkWaitingAccessReq.getUserAccount());
        }
        if (!StringUtils.isEmpty(checkWaitingAccessReq.getIsShow())){
            applyOrder.setIsShow(checkWaitingAccessReq.getIsShow());
        }
        return applyOrder;
    }

}
