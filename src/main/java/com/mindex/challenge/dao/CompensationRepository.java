package com.mindex.challenge.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;

@Repository
public interface CompensationRepository extends MongoRepository<Compensation, Employee>{
	public Compensation findByEmployeeEmployeeId(String id);
	public boolean existsByEmployeeEmployeeId(String id);

}
