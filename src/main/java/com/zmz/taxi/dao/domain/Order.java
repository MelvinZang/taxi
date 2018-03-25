package com.zmz.taxi.dao.domain;

import java.util.Date;

public class Order {
    private Long id;

    private String userDriver;

    private String userCustomer;

    private String totalTimeNumber;

    private String waitTimeNumber;

    private String distanceNumber;

    private String priceNumber;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserDriver() {
        return userDriver;
    }

    public void setUserDriver(String userDriver) {
        this.userDriver = userDriver;
    }

    public String getUserCustomer() {
        return userCustomer;
    }

    public void setUserCustomer(String userCustomer) {
        this.userCustomer = userCustomer;
    }

    public String getTotalTimeNumber() {
        return totalTimeNumber;
    }

    public void setTotalTimeNumber(String totalTimeNumber) {
        this.totalTimeNumber = totalTimeNumber;
    }

    public String getWaitTimeNumber() {
        return waitTimeNumber;
    }

    public void setWaitTimeNumber(String waitTimeNumber) {
        this.waitTimeNumber = waitTimeNumber;
    }

    public String getDistanceNumber() {
        return distanceNumber;
    }

    public void setDistanceNumber(String distanceNumber) {
        this.distanceNumber = distanceNumber;
    }

    public String getPriceNumber() {
        return priceNumber;
    }

    public void setPriceNumber(String priceNumber) {
        this.priceNumber = priceNumber;
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userDriver='" + userDriver + '\'' +
                ", userCustomer='" + userCustomer + '\'' +
                ", totalTimeNumber='" + totalTimeNumber + '\'' +
                ", waitTimeNumber='" + waitTimeNumber + '\'' +
                ", distanceNumber='" + distanceNumber + '\'' +
                ", priceNumber='" + priceNumber + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}