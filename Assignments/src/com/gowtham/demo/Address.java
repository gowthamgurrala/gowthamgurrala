package com.gowtham.demo;

public class Address {
	
	private String hno;
	private String colony;
	 private Company company;
	 
	public Address() {
		super();
	}

	public Address(String hno, String colony, Company company) {
		super();
		this.hno = hno;
		this.colony = colony;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colony=" + colony + ", company=" + company + "]";
	}
	 
	
}
