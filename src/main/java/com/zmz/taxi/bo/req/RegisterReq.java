package com.zmz.taxi.bo.req;

import java.io.Serializable;

public class RegisterReq extends BaseReq implements Serializable{


    private static final long serialVersionUID = -6745631201462202902L;

    private String type;

    private String account;

    private String password;

    private String nickname;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "RegisterReq{" +
                "type='" + type + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
