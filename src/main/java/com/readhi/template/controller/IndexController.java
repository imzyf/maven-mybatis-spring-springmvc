package com.readhi.template.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.readhi.template.service.DomainService;

@Controller
@RequestMapping("/")
public class IndexController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DomainService domainService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request) {

		model.addAttribute("originURL", "");
		model.addAttribute("controllerName", "index");

		return "index";

	}

}
