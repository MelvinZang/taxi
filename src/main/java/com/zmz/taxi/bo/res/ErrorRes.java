package com.zmz.taxi.bo.res;



import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/3.
 */
public class ErrorRes implements Serializable{
    private static final long serialVersionUID = 9156782312137773895L;
    private  String returnCode;
    private  String returnMessage;
    private  String returnUserMessage;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public String getReturnUserMessage() {
        return returnUserMessage;
    }

    public void setReturnUserMessage(String returnUserMessage) {
        this.returnUserMessage = returnUserMessage;
    }
}
