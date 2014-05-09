package com.hnsnmn.admin.webapp.controller;

import com.hnsnmn.framework.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 4. 27.
 * Time: 오후 5:36
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseWebAppController implements BaseController {
	@Autowired
	HttpServletRequest request;
}
