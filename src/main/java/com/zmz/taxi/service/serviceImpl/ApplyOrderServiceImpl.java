package com.zmz.taxi.service.serviceImpl;

import com.zmz.taxi.bo.req.ApplyOrderReq;
import com.zmz.taxi.bo.req.CheckWaitingAccessReq;
import com.zmz.taxi.bo.res.BaseRes;
import com.zmz.taxi.bo.res.QueryRes;
import com.zmz.taxi.common.converter.ApplyOrderConvert;
import com.zmz.taxi.dao.ApplyOrderMapper;
import com.zmz.taxi.dao.domain.ApplyOrder;
import com.zmz.taxi.service.ApplyOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

import static com.zmz.taxi.common.constant.HTTPConstants.*;

@Service("ApplyOrderService")
public class ApplyOrderServiceImpl implements ApplyOrderService{

    @Resource
    ApplyOrderMapper applyOrderMapper;

    @Override
    public QueryRes<ApplyOrder> saveApplyOrder(ApplyOrderReq applyOrderReq) {
        QueryRes<ApplyOrder> queryRes = new QueryRes<>();
        ApplyOrder applyOrder = ApplyOrderConvert.applyOrderReqConvert(applyOrderReq);
        try{
            applyOrderMapper.insert(applyOrder);
            applyOrder = applyOrderMapper.selectByPrimaryKey(applyOrder.getId());
            queryRes.setData(applyOrder);
            queryRes.setSuccessRes(SAVE_ORDER_SUCCESS);
        }catch (Exception e){
            queryRes.setErrorRes(SAVE_ORDER_FAIL);
        }

        return queryRes;
    }

    @Override
    public QueryRes<ApplyOrder> checkIsShow(CheckWaitingAccessReq checkWaitingAccessReq) {
        QueryRes<ApplyOrder> queryRes = new QueryRes<>();
        ApplyOrder applyOrder = ApplyOrderConvert.checkWaitingAccessReqConvert(checkWaitingAccessReq);
        try{
            ApplyOrder applyOrderBase = applyOrderMapper.selectByUserCustomerAndIsShow(applyOrder);
            if (applyOrderBase != null){
                queryRes.setData(applyOrderBase);

            }

        }catch(Exception e){
            System.out.println(e);
            queryRes.setErrorCodeOneRes(QUERY_WAITING_ACCESS_FAIL);
            return queryRes;
        }

        if ("1".equals(applyOrder.getIsShow())){
            queryRes.setSuccessRes(QUERY_WAITING_ACCESS_SUCCESS);

        }else if("2".equals(applyOrder.getIsShow())){
            queryRes.setSuccessRes(QUERY_Driving_ACCESS_SUCCESS);
        }

        return queryRes;
    }

    @Override
    public BaseRes updateApplyOrder(ApplyOrder applyOrder) {
        BaseRes baseRes;
        try{
            applyOrderMapper.updateByPrimaryKey(applyOrder);
            baseRes = BaseRes.getSuccess(CANCEL_APPLY_ORDER_SUCCESS);
        }catch(Exception e){
            baseRes = BaseRes.getError(CANCEL_APPLY_ORDER_FAIL);
        }


        return baseRes;
    }

    @Override
    public QueryRes<List<ApplyOrder>> checkApplyOrder() {
        QueryRes<List<ApplyOrder>> queryRes = new QueryRes<>();

        List<ApplyOrder> applyOrderData;
        try{
            applyOrderData = applyOrderMapper.selectByIsShow();
            if (applyOrderData != null){
                queryRes.setData(applyOrderData);
            }
            queryRes.setSuccessRes(APPLY_ORDER_LIST_SUCESS);

        }
        catch (Exception e){
            System.out.println(e);
            queryRes.setErrorCodeOneRes(APPLY_ORDER_LIST_FAIL);
        }




        return queryRes;
    }
}
