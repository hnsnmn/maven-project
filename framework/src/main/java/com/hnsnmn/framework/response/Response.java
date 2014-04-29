package com.hnsnmn.framework.response;

import com.hnsnmn.framework.common.Key;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 4. 28.
 * Time: 오후 5:00
 * To change this template use File | Settings | File Templates.
 */
@XStreamAlias(Key.response)
@XmlRootElement(name = Key.response)
public class Response implements Serializable {


	private class Result {}
	private @XStreamAlias(value = Key.result, impl = Response.Result.class) Object result;
	private Meta meta = new Meta();

	public void setError(int code, String msg) {
		meta.setCode(code);
		result = msg;
	}

	public void setError(int code, Object msg) {
		meta.setCode(code);
		result = msg;
	}

	@XmlElement(type = Object.class)
	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	@XmlElement
	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	@Override
	public String toString() {
		return "Response{" +
				"result=" + result +
				", meta=" + meta +
				"}";
	}
}
