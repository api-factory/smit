package com.sun;

public class Parent {

	int age;
	String city;
	
	public Parent() {
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	public void income()
	{
		System.out.println("Parent overiden method income called");
	}
	
	/*public void house()
	{
		System.out.println("Parent overiden method house called");
	}*/
}
