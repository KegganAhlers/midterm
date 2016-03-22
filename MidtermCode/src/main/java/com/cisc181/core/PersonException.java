package com.cisc181.core;

public class PersonException extends Exception {
	private Person Person;
	
	public PersonException(Person Person){
		super();
		this.Person = Person;
		System.out.print("Information invalid, try again.");
	}

}
