package com.zmz.taxi.bo.res;



import java.io.Serializable;

/**
 * 
 * 〈返回信息 基础信息〉
 * 〈功能详细描述〉
 * @author Zangmz
 * @version 2016年8月13日
 * @see BaseRes
 * @since
 */
public class BaseRes implements Serializable {

	private static final long serialVersionUID = 8918126140546113737L;

	/**
	 * 1 成功 / -1 失败
	 */
	private String returnCode;
	/**
	 * success /error
	 */
	private String returnMessage;

	/**
	 * 
	 */
	private String returnUserMessage;

	public static BaseRes getSuccess(String returnUserMessage) {
		BaseRes baseRes = new BaseRes();
		baseRes.setReturnCode("1");
		baseRes.setReturnMessage("success");
		baseRes.setReturnUserMessage(returnUserMessage);
		return baseRes;

	}

	public static BaseRes getError(String returnUserMessage) {
		BaseRes baseRes = new BaseRes();
		baseRes.setReturnCode("-1");
		baseRes.setReturnMessage("error");
		baseRes.setReturnUserMessage(returnUserMessage);
		return baseRes;

	}

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

	@Override
	public String toString() {
		return "BaseRes{" +
				"returnCode='" + returnCode + '\'' +
				", returnMessage='" + returnMessage + '\'' +
				", returnUserMessage='" + returnUserMessage + '\'' +
				'}';
	}
}
