package com.learn.polymorphism;

public class Son extends Parents  {

	// This class is to illustrate method overriding
	//with a practical example.
	// Run time polymorphism

	public void marriage() {
		System.out.println("my marriage my rule");
	}
	public static void main(String[] args) {
		Parents parents = new Son();// ParentClass ref= new ChildClass();
		parents.properties();
		parents.marriage();

	}

}
