package com.hnsnmn.admin.api.controller;

import com.hnsnmn.admin.api.common.ApiRequestUrl;
import com.hnsnmn.admin.api.common.HttpError;
import com.hnsnmn.framework.common.Const;
import com.hnsnmn.framework.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 4. 27.
 * Time: 오후 11:39
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(ApiRequestUrl.ERROR_CONTROLLER)
public class HttpErrorController extends BaseApiController {
	private @Autowired HttpError httpError;

	@RequestMapping(value = "/400")
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody ModelAndView badRequest() {
		Response response = this.serverResponse();
		response.setError(httpError.BAD_REQUEST_CODE, httpError.BAD_REQUEST_MESSAGE);
		return mav().addObject(Const.responseKey, response);
	}

}
