package com.kocfinans.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "credit_score_model")
public class CreditScoreModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "credit_score")
	@Column(name = "uniqueId")
	private int uniqueId;
	
	@Column(name = "national_id")
	private int nationalId;
	
	@Column(name = "credit_score")
	private String creditScore;

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}


	public String getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}

}
