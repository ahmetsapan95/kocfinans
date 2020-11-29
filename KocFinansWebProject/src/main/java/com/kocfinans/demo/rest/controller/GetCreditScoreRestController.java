package com.kocfinans.demo.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.kocfinans.demo.dao.CreditScoreRepository;
import com.kocfinans.demo.model.CreditScoreModel;
import com.kocfinans.demo.rest.model.CC5Request;
import com.kocfinans.demo.rest.model.CC5Response;

@RestController
public class GetCreditScoreRestController {

	@Autowired
	CreditScoreRepository creditScoreRepository;

	@RequestMapping(value = "/api", method = RequestMethod.POST)
    public CC5Response postCC5Request(@RequestBody CC5Request cc5Request)  {
		CC5Response cc5Response = new CC5Response();
		
		List<CreditScoreModel> creditScoreModel = new ArrayList<>();
		creditScoreModel = creditScoreRepository.findByNationalId(cc5Request.getNationalId());
		
		if(creditScoreModel.size() == 0)
		{
			cc5Response.setCreditScore(0);
			
		} else {
			cc5Response.setCreditScore(Integer.parseInt(creditScoreModel.get(0).getCreditScore()));
		}
		
		return cc5Response;
		
		
	}

}
