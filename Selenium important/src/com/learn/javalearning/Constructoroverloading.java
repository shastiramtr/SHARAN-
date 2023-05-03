package com.learn.javalearning;

public class Constructoroverloading {
	String draw;
	
	Constructoroverloading(){
		System.out.println("Draw object created");
	}
	Constructoroverloading(String toDraw){
		draw=toDraw;
		System.out.println("Drawing"+ toDraw);
	}
	public static void main(String[] args) {
		// parameter passed constructor
		Constructoroverloading draw=new Constructoroverloading();
		Constructoroverloading draw1=new Constructoroverloading("circle");
		

	}

}
