package com.kocfinans.demo.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="applicant_model")
public class ApplicantModel {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="uniqueId")
	private int uniquelId;
	@Column(name="nationalId")
	private int nationalId;
	@Column(name="fullName")
	private String fullName;
	@Column(name="income")
	private BigInteger income;
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public BigInteger getIncome() {
		return income;
	}

	public void setIncome(BigInteger income) {
		this.income = income;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


}
