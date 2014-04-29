package com.hnsnmn.framework.dispatcher;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * BaseDispatcherServlet acts as wrapper for Spring's DispatcherSerlvet class
 * so that we can have our own custom implementations written here to have those facilities
 * or features being provided to everybody extending this class
 * User: hongseongmin
 * Date: 2014. 4. 29.
 * Time: 오전 9:41
 * To change this template use File | Settings | File Templates.
 */
public class BaseDispatcherServlet extends DispatcherServlet{
	private static final long serialVersionUID = 112233448L;

	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		super.doService(request, response);    //To change body of overridden methods use File | Settings | File Templates.
	}

	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		super.doDispatch(request, response);    //To change body of overridden methods use File | Settings | File Templates.
	}

	@Override
	protected void service(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);
	}
}
