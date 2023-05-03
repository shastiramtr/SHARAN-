package com.learn.javalearning;

public class Staticvariable {
// Example to show, static variable are shared among objects.
	static int accountbalance=0;
	String depositedBy;


	public static void main(String[] args) {
		Staticvariable object1=new Staticvariable();
		object1.accountbalance=1000;
		object1.depositedBy="shasti";

		Staticvariable object2=new Staticvariable();
		object2.accountbalance=2000;
		object2.depositedBy="ram";

		System.out.println("object integer:"+object1.accountbalance);
		System.out.println("object string:"+object1.depositedBy);
		System.out.println("object integer:"+object2.accountbalance);
		System.out.println("object string:"+object2.depositedBy);
	}

}
