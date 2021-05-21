package com.mindex.challenge.data;

import org.springframework.stereotype.Component;

@Component
public class ReportingStructure {
	private Employee employee;
	private int numberOfReports;
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public int getNumberOfReports() {
		return numberOfReports;
	}
	
	public void setNumberOfReports(int numberOfReports) {
		this.numberOfReports = numberOfReports;
	}
	
	public ReportingStructure() {
		super();
	}
	
	public ReportingStructure(Employee employee, int numberOfReports) {
		super();
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "ReportingStructure [employee=" + employee + ", numberOfReports=" + numberOfReports + "]";
	}
		
}
