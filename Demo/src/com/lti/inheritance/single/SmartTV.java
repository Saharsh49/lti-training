package com.lti.inheritance.single;

import com.lti.inheritance.parent.Television;

public class SmartTV extends Television{
	
	private float screenSize;
	
	public SmartTV(String cname, float sc) {
		super(cname);
		this.screenSize = sc;
		System.out.println("Parameterized const. from child");
	}

	public SmartTV(String cname) {
		super(cname);
		System.out.println("Parameterized const. from child");
	}
	
	public SmartTV() {
		super();
		System.out.println("No Arg const. from child");
	}
	
	public void display() {
		System.out.println(this.screenSize);
	}
}
