package com.zmz.taxi.bo.req;


public class OrderSaveReq extends BaseReq{

    private String userDriver;

    private String userCustomer;

    private String totalTimeNumber;

    private String waitTimeNumber;

    private String distanceNumber;

    private String priceNumber;


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

    @Override
    public String toString() {
        return "OrderSaveReq{" +
                "userDriver='" + userDriver + '\'' +
                ", userCustomer='" + userCustomer + '\'' +
                ", totalTimeNumber='" + totalTimeNumber + '\'' +
                ", waitTimeNumber='" + waitTimeNumber + '\'' +
                ", distanceNumber='" + distanceNumber + '\'' +
                ", priceNumber='" + priceNumber + '\'' +
                '}';
    }
}
