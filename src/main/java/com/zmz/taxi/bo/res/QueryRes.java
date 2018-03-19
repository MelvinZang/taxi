
package com.zmz.taxi.bo.res;



import java.io.Serializable;

public class QueryRes<T> implements Serializable{

	private static final long serialVersionUID = -6109910697712267062L;
	private ErrorRes error;

	private T data;

	public ErrorRes getError() {
		return error;
	}

	public void setError(ErrorRes error) {
		this.error = error;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setErrorRes(String returnUserMessage) {
		ErrorRes errorRes = new ErrorRes();
		errorRes.setReturnCode("-1");
		errorRes.setReturnMessage("error");
		errorRes.setReturnUserMessage(returnUserMessage);
		this.setError(errorRes);
	}
	
	public void setSuccessRes(String returnUserMessage) {
		ErrorRes errorRes = new ErrorRes();
		errorRes.setReturnCode("0");
		errorRes.setReturnMessage("success");
		errorRes.setReturnUserMessage(returnUserMessage);
		this.setError(errorRes);
	}
	
	/**
	 * 返回错误码为1
	 * @param returnUserMessage 
	 * @see
	 */
	public void setErrorCodeOneRes(String returnUserMessage) {
		ErrorRes errorRes = new ErrorRes();
		errorRes.setReturnCode("1");
		errorRes.setReturnMessage("fail");
		errorRes.setReturnUserMessage(returnUserMessage);
		this.setError(errorRes);
	}


}
