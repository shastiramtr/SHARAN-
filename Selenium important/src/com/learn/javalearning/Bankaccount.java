package com.learn.javalearning;

public class Bankaccount {
	// Data
	long accountnumber=325383948;

	String accountholdername="Shastiram";

	Integer accountbalance=1550;
	//User defined Method 
	public void getbalane(){
		System.out.println("Balance is"+ accountbalance);

	}
	// Main Method Build in method
	public static void main(String[] args) {
		//ClassName objName= new ClassName();
		Bankaccount account = new Bankaccount();
		account.getbalane();


	}

}
