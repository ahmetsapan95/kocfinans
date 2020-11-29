package com.kocfinans.demo.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.HtmlUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.kocfinans.demo.constants.Constants;
import com.kocfinans.demo.dao.ApplicantRepository;
import com.kocfinans.demo.model.ApplicantModel;
import com.kocfinans.demo.model.ApplicationResultDataModel;
import com.kocfinans.demo.rest.model.CC5Request;
import com.kocfinans.demo.rest.model.CC5Response;
import com.kocfinans.demo.services.ProcessCreditResultService;
import com.kocfinans.demo.services.SmsService;

@Controller
public class HomeController {
	
	@Autowired
	ApplicantRepository applicantRepository;
	
	@Autowired
	SmsService smsService;
	
	@Autowired
	ProcessCreditResultService processCreditResultService;
	
	@RequestMapping(value = {"/", "home"}, method = RequestMethod.GET)
	public String home() {
		
		return "home" ;
	}
	
	@RequestMapping(value = {"/", "home"},  method = RequestMethod.POST)
	public String homePost(ApplicantModel applicantModel, Model model) throws JsonProcessingException 
	{

			CC5Request cc5Request = new CC5Request();
			cc5Request.setNationalId(applicantModel.getNationalId());
			//To capture request via PostMan Proxy: "http://192.168.5.45:5555/"
			String uri = (Constants.API_URI);
			
			XmlMapper xmlMapper = new XmlMapper();
			String cc5RequestXLMString =  xmlMapper.writeValueAsString(cc5Request);
			
			RestTemplate restTemplate = new RestTemplate();
			
		    HttpHeaders headers = new HttpHeaders();
		    headers.setContentType(MediaType.APPLICATION_XML);
		    headers.setContentLength(5000);
		    HttpEntity<String> request = new HttpEntity<>(cc5RequestXLMString, headers);
		    
		    ResponseEntity<CC5Response> cc5ResponseEntity = restTemplate.postForEntity(uri, request, CC5Response.class);
			
		    ApplicationResultDataModel applicationResultDataModel = parseCreditScoreModel(cc5ResponseEntity);
		    applicationResultDataModel.setNationalId(applicantModel.getNationalId());
		    applicationResultDataModel.setLimit(processCreditResultService.calculateLimit(applicationResultDataModel.getCreditScore(),applicantModel.getIncome()).toString());
		    applicationResultDataModel.setResultMessage(processCreditResultService.setResultMessage(new BigInteger(applicationResultDataModel.getLimit())));
		   
		    applicantRepository.save(applicantModel);
		    
		    if(applicationResultDataModel.getResultMessage().equals(Constants.APPROVED))
		    {
		    	model.addAttribute("ResultMessage", Constants.APPROVED);
		    	smsService.sendSms(Constants.RESULT_MESSAGE_APPROVED + applicationResultDataModel.getLimit() +"TL", applicantModel.getPhoneNumber());
		    } else {
		     	model.addAttribute("ResultMessage", Constants.REJECTED);
		    	smsService.sendSms(Constants.RESULT_MESSAGE_REJECTED, applicantModel.getPhoneNumber());
		    }
		    model.addAttribute(applicationResultDataModel);
		    return "applicationResult" ;
	}

	

	private ApplicationResultDataModel parseCreditScoreModel(ResponseEntity<CC5Response> cc5ResponseEntity) {
		
		ApplicationResultDataModel applicationResultDataModel  = new ApplicationResultDataModel();
		
		applicationResultDataModel.setCreditScore(cc5ResponseEntity.getBody().getCreditScore());
		
		return applicationResultDataModel;
	}
	
// Application validation can be done here. Check if applicant has applied earlier within the instance time.
// eg: Applicants can apply every 1 week. 
	
//	private boolean validateApplicant(int nationalId) { 
//		ApplicantModel applicantModel = applicantRepository.findById(nationalId).orElse(null);
//		
//		if(applicantModel.equals(null)) {
//			return true;
//		}
//		return false;
//	}
	
}
