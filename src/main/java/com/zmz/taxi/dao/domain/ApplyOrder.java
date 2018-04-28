package com.zmz.taxi.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class ApplyOrder implements Serializable {
    private Long id;

    private String userCustomer;

    private String startLocation;

    private String endLocation;

    private String isShow;

    private Date createTime;

    private Date updateTime;

    private String customerConfirm;

    private String driverConfirm;

    private String userDriver;

    public String getUserDriver() {
        return userDriver;
    }

    public void setUserDriver(String userDriver) {
        this.userDriver = userDriver;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        return "ApplyOrder{" +
                "id=" + id +
                ", userCustomer='" + userCustomer + '\'' +
                ", startLocation='" + startLocation + '\'' +
                ", endLocation='" + endLocation + '\'' +
                ", isShow='" + isShow + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", customerConfirm='" + customerConfirm + '\'' +
                ", driverConfirm='" + driverConfirm + '\'' +
                ", userDriver='" + userDriver + '\'' +
                '}';
    }
}