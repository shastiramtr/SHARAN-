package com.learn.javalearning;

public class Noargumentconstructor {

	int empolyeeid;
	String empolyeeName;
	// Define a No Argument Constructor

	Noargumentconstructor(){
		empolyeeid = 1;
		empolyeeName= "Ram";
		System.out.println("New empoly cteated");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noargumentconstructor empolyee =new Noargumentconstructor();

	}

}
