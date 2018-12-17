package com.sun;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashMap;

public class Main {


	public static void main(String[] args) {
		HashMap<Employee,String> employeeMap = new HashMap<Employee,String>(); 
		Employee employee1 = new Employee();    
	    employee1.setId(1);    
	    employee1.setName("Sachin");    
	    employee1.setDateOfBirth(new Date(1987,2,1));    
	    employee1.setSalary(new BigDecimal(100000));
	    employeeMap.put(employee1,"India"); 
	    System.out.println(employeeMap);

	}

}
