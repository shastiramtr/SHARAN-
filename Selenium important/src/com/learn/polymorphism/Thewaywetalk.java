package com.learn.polymorphism;

public class Thewaywetalk {

	// This class is to illustrate method overloading with a practical Example.


	public void talk (Parents styleoftalking) {
		System.out.println("polite,respectfull");
	}
	public void talk (Partner styleoftalking) {
		System.out.println("Love,Romantic");
	}
	public void talk (Boss styleoftalking) {
		System.out.println("Nothing personal");
	}


	public static void main(String[] args) {
		Thewaywetalk talk = new Thewaywetalk();
		
		Parents parents=new Parents();
		talk.talk(parents);

		Boss boss = new Boss();
		talk.talk(boss);
		
		Partner partner =new Partner();
		talk.talk(partner);
	}		

}
