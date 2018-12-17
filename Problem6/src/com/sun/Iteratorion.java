package com.sun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorion {

	public Iteratorion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> listANmes = new ArrayList<>();
		listANmes.add("abc");
		listANmes.add("xyz");
		listANmes.add("pqr");

		//Using Iterator
		Iterator<String> iter = listANmes.iterator();
		while(iter.hasNext())
		{
			String name = iter.next();
			System.out.println(name);
		}
		
		//Using For Each loop
		for(String names : listANmes)
		{
		  System.out.println(names);	
		}
	}

}
