package com.lti.inheritance.single;

import com.lti.inheritance.parent.Television;

public class Executor {

	public static void main(String[] args) {
		
		Television t1 = new Television("Sony");
		t1 = new Television("Samsung");
		t2 = new Television("MI");
		System.out.println(t1.getCompanyName());
		System.out.println(t2.getCompanyName());

	}

}
