package com.mindex.challenge.data;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Compensation {
	@Id
	private Employee employee;
	private double salary;
	private Date effectiveDate;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	@Override
	public String toString() {
		return "Compensation [employee=" + employee + ", salary=" + salary + ", effectiveDate=" + effectiveDate + "]";
	}
	public Compensation() {
		super();
	}
	public Compensation(Employee employee, double salary, Date effectiveDate) {
		super();
		this.employee = employee;
		this.salary = salary;
		this.effectiveDate = effectiveDate;
	}
	
}
