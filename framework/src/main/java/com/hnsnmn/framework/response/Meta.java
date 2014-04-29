package com.hnsnmn.framework.response;

import com.hnsnmn.framework.common.Key;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 4. 28.
 * Time: 오후 5:13
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = Key.meta)
public class Meta {
	private int code;
	private String responseTime;
	private long resopnseTimeL;
	private @XStreamOmitField long timeOfRequest;

	public Meta() {
		this.timeOfRequest = System.currentTimeMillis();
	}

	@XmlElement
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public long getTimeOfRequest() {
		return timeOfRequest;
	}

	public void setResponseTime(long timeOfRequest) {
		this.timeOfRequest = timeOfRequest;
	}

	@XmlElement
	public String getResponseTime() {
		this.resopnseTimeL = System.currentTimeMillis() - timeOfRequest;
		return resopnseTimeL + " ms";
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	@Override
	public String toString() {
		return "Meta{" +
				"code =" + code +
				", responseTime=" + responseTime +
				"}";
	}
}
