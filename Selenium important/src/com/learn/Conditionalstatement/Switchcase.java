package com.learn.Conditionalstatement;

public class Switchcase {

	String hero= "shastiram";

	public void heroornot() {

		switch(hero) {
		case "captain america":
			System.out.println("captain america is a super hero");
			break;
		case "superman":
			System.out.println("superman is asuperhero");
			break;
		case "shastiram":
			System.out.println("batman is a super hero");
			break;
		default:
			System.out.println(hero+" sorry i dont about this person");	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switchcase hero= new Switchcase();
		hero.heroornot();

	}

}
