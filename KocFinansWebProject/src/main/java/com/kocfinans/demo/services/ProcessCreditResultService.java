package com.kocfinans.demo.services;

import java.math.BigInteger;

import org.springframework.stereotype.Service;

import com.kocfinans.demo.constants.Constants;

@Service
public class ProcessCreditResultService {

		public String setResultMessage(BigInteger limit) {
			
			if(limit.compareTo(new BigInteger("0")) == 1 ) {
				return Constants.APPROVED;
			} else {
				return Constants.REJECTED;
			}
		}
	
		public BigInteger calculateLimit(int creditScore, BigInteger income) {
			if(creditScore < 500)
			{
				return new BigInteger("0");
			
			} else if( (500 <= creditScore && creditScore < 1000) && income.compareTo(new BigInteger("5000")) == -1){
				return new BigInteger("10000");
				
			} else if( (500 <= creditScore && creditScore < 1000) && (income.compareTo(new BigInteger("5000")) == 1 || income.compareTo(new BigInteger("5000")) == 0 ) ){
				return new BigInteger("10000");
			
			} else {
				return income.multiply(new BigInteger("4"));
			}
			
		}
}
