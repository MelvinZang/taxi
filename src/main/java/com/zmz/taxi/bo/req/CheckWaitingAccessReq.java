package com.zmz.taxi.bo.req;

public class CheckWaitingAccessReq {

    private String userAccount;

    private String isShow;

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return "CheckWaitingAccessReq{" +
                "userAccount='" + userAccount + '\'' +
                ", isShow='" + isShow + '\'' +
                '}';
    }
}
