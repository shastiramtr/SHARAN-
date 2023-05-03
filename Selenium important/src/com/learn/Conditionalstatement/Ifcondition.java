package com.learn.Conditionalstatement;

public class Ifcondition {

	//boolean is a data type - true,false

	boolean iscupempty = false;
	
	
	public static void main (String[] args) {

		Ifcondition cofee=new Ifcondition();
		if(cofee.iscupempty) {
			System.out.println("Fill the cup");
		}
		else {
			System.out.println("Drink the cofee");
		}
	}

}

 