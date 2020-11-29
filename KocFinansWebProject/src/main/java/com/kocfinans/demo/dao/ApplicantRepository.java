package com.kocfinans.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.kocfinans.demo.model.ApplicantModel;

public interface ApplicantRepository extends CrudRepository<ApplicantModel, Integer> {

	
}
