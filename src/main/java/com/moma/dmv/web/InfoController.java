package com.moma.dmv.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moma.dmv.entity.Info;
import com.moma.dmv.service.InfoService;

@Controller
@RequestMapping("/info")
public class InfoController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private InfoService infoService;

	@RequestMapping(value = "/one", method = RequestMethod.GET)
	public String oneInfo(Model model) {

		logger.info("/one");

		Info info = infoService.queryById(1);
		model.addAttribute("info", info);
		return "oneinfo";
	}

}
