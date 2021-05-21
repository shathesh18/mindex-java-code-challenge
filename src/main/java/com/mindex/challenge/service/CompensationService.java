package com.mindex.challenge.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.exception.CompensationExistsException;
import com.mindex.challenge.service.impl.CompensationDTO;

public interface CompensationService {
	Compensation create(CompensationDTO compensationDTO) throws ParseException, CompensationExistsException;
	Compensation read(String id);
}
