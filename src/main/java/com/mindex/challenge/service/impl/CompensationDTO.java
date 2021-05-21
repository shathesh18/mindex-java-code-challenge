package com.mindex.challenge.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class CompensationDTO {
	
	private String employeeId;
	private double salary;
	private String effectiveDate;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public CompensationDTO(double salary, String effectiveDate) {
		super();
		
		this.salary = salary;
		this.effectiveDate = effectiveDate;
	}
	public CompensationDTO() {
		super();
	}
	@Override
	public String toString() {
		return "CompensationDTO [employeeId=" + employeeId + ", salary=" + salary + ", effectiveDate=" + effectiveDate
				+ "]";
	}
	
	
}
