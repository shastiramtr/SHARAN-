package com.learn.polymorphism;

public class Overloading {

	int add (int n1, int n2) {
		return n1+n2;
	}
	int add (int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	float add(float n1, float n2) {
		return n1+n2;
	}
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		System.out.println("Sum of two numbers:"+ obj.add(10,11));
		System.out.println("Sum of two numbers:"+obj.add(10, 11, 12));
		

	}

}
