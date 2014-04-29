package com.hnsnmn.admin.api.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 4. 27.
 * Time: 오후 11:46
 * To change this template use File | Settings | File Templates.
 */
@ImportResource(value = "classpath:/config/spring/applicationContext-properties.xml")
public class HttpError {

	// Common HTTP errors
	public @Value("#{httpErrorProperties['badRequest.message']}") String BAD_REQUEST_MESSAGE;
	public @Value("#{httpErrorProperties['badRequest.code']}") int BAD_REQUEST_CODE;
}
