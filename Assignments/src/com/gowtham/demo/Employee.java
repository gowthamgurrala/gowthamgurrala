package com.gowtham.demo;

public class Employee {
	private int eid;
	private String ename;
	private double esalary;

	private Address address;

	public Employee(int eid, String ename, double esalary, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.address = address;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", address=" + address + "]";
	}

}
