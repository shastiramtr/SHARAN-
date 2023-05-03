package com.learn.Conditionalstatement;

public class Ifelseif {

	String myheroname = "Shasti";

	public void superheroguesser() {
		if(myheroname.equals("ironman")) {
			System.out.println("you thought about Iron man");
		}else if(myheroname.equals("super man")){
			System.out.println("you thought about super man ");
		}else if (myheroname.equals("Shasti")){
			System.out.println("you thought about Shastiram");
		}else {
			System.out.println("Sorry i cant guess!!!");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifelseif hero=new Ifelseif();
		hero.superheroguesser();
	
	}	
	}
