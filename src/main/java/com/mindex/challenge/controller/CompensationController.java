package com.mindex.challenge.controller;

import java.text.ParseException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.exception.CompensationExistsException;
import com.mindex.challenge.service.CompensationService;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.impl.CompensationDTO;

@RestController
@RequestMapping("employee/{id}/compensation")
public class CompensationController {
	
	private static final Logger LOG = LoggerFactory.getLogger(CompensationController.class);

    @Autowired
    private CompensationService compensationService;

    @PostMapping
    public Compensation create(@RequestBody CompensationDTO compensationDTO, @PathVariable String id) throws ParseException, CompensationExistsException {
        compensationDTO.setEmployeeId(id);
        LOG.debug("Received Compensation create request for [{}]", compensationDTO);
        return compensationService.create(compensationDTO);
    }

    @GetMapping 
    public Compensation read(@PathVariable String id){
    	 LOG.debug("Received Compensation read request for id [{}]", id);
    	 return compensationService.read(id);
    }
}
