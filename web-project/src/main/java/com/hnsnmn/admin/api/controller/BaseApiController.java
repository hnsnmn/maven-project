package com.hnsnmn.admin.api.controller;

import com.hnsnmn.framework.response.Response;
import com.hnsnmn.framework.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;



/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 4. 27.
 * Time: 오후 11:21
 * To change this template use File | Settings | File Templates.
 */
public class BaseApiController extends BaseController {
	private Logger logger = LoggerFactory.getLogger(BaseApiController.class);

	protected ModelAndView mav() {
		return new ModelAndView();
	}

	public Response serverResponse() {
		Response response = new Response();
		return response;
	}
}
