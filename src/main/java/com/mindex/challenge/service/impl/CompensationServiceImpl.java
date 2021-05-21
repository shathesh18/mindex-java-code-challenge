package com.mindex.challenge.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.exception.CompensationExistsException;
import com.mindex.challenge.service.CompensationService;

@Service
public class CompensationServiceImpl implements CompensationService{

	@Autowired
	private CompensationRepository compensationRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository; 
	
	@Override
	public Compensation create(CompensationDTO compensationDTO) throws ParseException, CompensationExistsException {
		if (compensationRepository.existsByEmployeeEmployeeId(compensationDTO.getEmployeeId())) 
				throw new CompensationExistsException("Compensation for employee with id - "+compensationDTO.getEmployeeId()+" already exist");
		Compensation compensation = new Compensation();
		compensation.setEmployee(employeeRepository.findByEmployeeId(compensationDTO.getEmployeeId()));
		compensation.setSalary(compensationDTO.getSalary());
		compensation.setEffectiveDate(new SimpleDateFormat ("yyyy-MM-dd").parse(compensationDTO.getEffectiveDate()));
		
		return compensationRepository.save(compensation);
	}

	@Override
	public Compensation read(String id) {
		// TODO Auto-generated method stub
		return compensationRepository.findByEmployeeEmployeeId(id);
	}

}
