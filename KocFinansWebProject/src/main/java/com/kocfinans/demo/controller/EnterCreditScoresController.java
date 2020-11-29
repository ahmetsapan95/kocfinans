package com.kocfinans.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.kocfinans.demo.dao.CreditScoreRepository;
import com.kocfinans.demo.model.CreditScoreModel;

@Controller
public class EnterCreditScoresController {
	
	@Autowired
	CreditScoreRepository creditScoreRepository;
	
	@RequestMapping(value = {"/", "enterCreditScore"}, method = RequestMethod.GET)
	public String enterCreditScoreGet() {
		
		return "enterCreditScore" ;
	}
	
	@RequestMapping(value = {"/", "enterCreditScore"}, method = RequestMethod.POST)
	public void enterCreditScorePost(CreditScoreModel creditScoreModel) {
		
		creditScoreRepository.save(creditScoreModel);
		
		
	}
}
