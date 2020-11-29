package com.kocfinans.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ApplicationResultController {
	@RequestMapping(value = {"/", "applicationResult"}, method = RequestMethod.GET)
	public String applicationResult() {
		
		return "applicationResult" ;
	}
}
