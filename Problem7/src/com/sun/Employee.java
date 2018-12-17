package com.sun;

import java.math.BigDecimal;
import java.sql.Date;

public class Employee {
	
	private long id;   
    private String name;   
    private Date dateOfBirth;    
    private BigDecimal salary;

	public Employee() {
	}
	

	public Employee(long id, String name, Date dateOfBirth, BigDecimal salary) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + "]";
	}

	
	
}
