package com.zmz.taxi.bo.req;

public class ApplyOrderReq extends BaseReq {
    private String userCustomer;

    private String startLocation;

    private String endLocation;

    private String isShow;

    private String customerConfirm;

    private String driverConfirm;

    public String getUserCustomer() {
        return userCustomer;
    }

    public void setUserCustomer(String userCustomer) {
        this.userCustomer = userCustomer;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public String getCustomerConfirm() {
        return customerConfirm;
    }

    public void setCustomerConfirm(String customerConfirm) {
        this.customerConfirm = customerConfirm;
    }

    public String getDriverConfirm() {
        return driverConfirm;
    }

    public void setDriverConfirm(String driverConfirm) {
        this.driverConfirm = driverConfirm;
    }

    @Override
    public String toString() {
        return "ApplyOrderReq{" +
                "userCustomer='" + userCustomer + '\'' +
                ", startLocation='" + startLocation + '\'' +
                ", endLocation='" + endLocation + '\'' +
                ", isShow='" + isShow + '\'' +
                ", customerConfirm='" + customerConfirm + '\'' +
                ", driverConfirm='" + driverConfirm + '\'' +
                '}';
    }
}
