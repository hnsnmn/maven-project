package com.hnsnmn.admin.webapp.controller;

import com.hnsnmn.admin.webapp.common.WebAppRequestUrl;
import com.hnsnmn.admin.webapp.common.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 4. 27.
 * Time: 오후 6:00
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/sample/")
public class SampleBoardController extends BaseWebAppController {

	@RequestMapping(value = WebAppRequestUrl.LIST, method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		return View.SAMPLE_LIST;
	}
}
