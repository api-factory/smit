package com.sun;

//import java.io.IOException;

public class Child extends Parent {

	public Child() {
		// TODO Auto-generated constructor stub
	}
	
	public void income() throws NullPointerException
	{
		System.out.println("Child overiden  method called");
	}
	
	//Error if overiden with checked exception
/*	public void house() throws IOException
	{
		System.out.println("Child overiden method house called");
	}*/
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.income();
	}

}
