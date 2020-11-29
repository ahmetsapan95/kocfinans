package com.kocfinans.demo.services;

import org.springframework.stereotype.Service;

import com.kocfinans.demo.constants.Constants;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SmsService {

	public void sendSms(String smsText, String phoneNumber)
	{
		Twilio.init(Constants.ACCOUNT_SID, Constants.AUTH_TOKEN);
		
		Message message = Message.creator(
				new PhoneNumber(phoneNumber),
				new PhoneNumber(Constants.REMOTE_PHONE_NUMBER),
				smsText
			).create();
		
	}
}
