package com.learn.abstration;
// Abstract Class
public class Bmw extends Car  {
	@Override
	public void enginesecret() {
		System.out.println("Bmw engine secret");
	}
	@Override
	public void companyVault() {
		System.out.println("Bmw company vault");
	}
	public static void main(String[] args) {

		Car car= new Bmw();
		car.enginesecret();// Ctrl keypress mouse hover
		car.companyVault();

	}

}
