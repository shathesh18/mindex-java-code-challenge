package com.mindex.challenge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;

import io.netty.util.internal.MathUtil;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ReportingStructure reportingStructure;
	
	@Override
	public ReportingStructure read(String id) {
		reportingStructure.setEmployee(employeeRepository.findByEmployeeId(id));
		reportingStructure.setNumberOfReports(dfs(reportingStructure.getEmployee()));
		return reportingStructure;
	}
	
	private int dfs(Employee employee) {
		List<Employee> directReports = employee.getDirectReports();
		if (directReports == null) return 0;
		return directReports.size() + directReports.stream()
			.map(report -> dfs(employeeRepository.findByEmployeeId(report.getEmployeeId())))
			.reduce(0, Integer::sum);
	}

}
