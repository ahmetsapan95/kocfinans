package com.kocfinans.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kocfinans.demo.model.CreditScoreModel;

public interface CreditScoreRepository extends CrudRepository<CreditScoreModel, Integer> {

	List<CreditScoreModel> findByNationalId(int nationalId);

}
