package com.zmz.taxi.bo.req;

public class HistoryReq extends BaseReq{
    private String type;

    private String account;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "historyReq{" +
                "type='" + type + '\'' +
                ", account='" + account + '\'' +
                '}';
    }
}
