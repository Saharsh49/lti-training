package com.lti.lambdaexp;

import java.util.*;
import java.util.stream.Stream;

class Student{
	int sid;
	String name;
	int marks;
	public Student(int sid, String name, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
}

public class LambdaExp {

	public static void main(String[] args) {
		List<Student> ls = new ArrayList<Student>();
		
		ls.add(new Student(101, "Saharsh", 99));
		ls.add(new Student(102, "Ankit", 87));
		ls.add(new Student(103, "Ruthvik", 86));
		ls.add(new Student(104, "Sam", 78));
		
		/*for(String s : ls) {
			System.out.println(s);
		}*/
		
		//ls.forEach((l) -> System.out.println(l)); 
		
		Stream<Student> data = ls.stream().filter(l->l.marks<95);
		data.forEach(m->System.out.println(m.marks + " " + m.name));
	}

}
