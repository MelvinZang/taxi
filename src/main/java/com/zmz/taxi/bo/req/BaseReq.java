
package com.zmz.taxi.bo.req;

import java.io.Serializable;


public class  BaseReq implements Serializable {
    private static final long serialVersionUID = -686671523221888398L;

    /**
	 * 意义，目的和功能，以及被用到的地方<br>
	 */


	/**
	 * 接口版本号
	 */
	protected String version;

	/**
	 *  接入渠道 @see ReqChannel
	 */
	protected String channelId;
	/**
	 * 请求流水号
	 */
	protected String requestId;

	/**
	 * 请求时间(时间格式: yyyyMMddHHmms)
	 */
	protected String requestTime;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public String toString() {
		return "BaseReq{" +
				"version='" + version + '\'' +
				", channelId='" + channelId + '\'' +
				", requestId='" + requestId + '\'' +
				", requestTime='" + requestTime + '\'' +
				'}';
	}
}
