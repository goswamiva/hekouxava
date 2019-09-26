package com.herokutestsb.herkuArtifact.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class Contrllr {
	//static Logger logger=Logger.getLogger(Application.class.getName());
	Logger logger=Logger.getLogger(Contrllr.class.getName());
	@GetMapping("get")
	public String get() {
		logger.info("get method called");
		return "index.jsp";
	}
	
}
