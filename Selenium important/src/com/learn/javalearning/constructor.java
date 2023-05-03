package com.learn.javalearning;

public class constructor {
// Default constructor
	String student_name;
	int rollno;
	
	public static void main(String[] args) {
	
		constructor student= new constructor();
		System.out.println(student.student_name);
		System.out.println(student.rollno);
	}

}
