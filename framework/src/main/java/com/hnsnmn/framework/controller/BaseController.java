package com.hnsnmn.framework.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 4. 25.
 * Time: 오후 1:19
 * To change this template use File | Settings | File Templates.
 */
@SuppressWarnings("unchecked")
public class BaseController extends AbstractController {
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}
}
