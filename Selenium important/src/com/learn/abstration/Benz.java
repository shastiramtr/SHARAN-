package com.learn.abstration;

public class Benz extends Car implements Interface {
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
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is method2");
	}
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("This is method3");
	}


	

}
