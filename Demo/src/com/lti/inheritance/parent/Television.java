package com.lti.inheritance.parent;

public class Television {
	private String companyName;
	
	protected int volume;
	
	public Television() {
		System.out.println("No Arg Constructor from Parent");
	}
	
	public Television(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return companyName;
		
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void display() {
		System.out.println(this.companyName);
	}
}
