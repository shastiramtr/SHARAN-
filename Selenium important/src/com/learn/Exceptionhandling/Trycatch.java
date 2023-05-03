package com.learn.Exceptionhandling;

public class Trycatch {
// Multiple catch block 
	public static void main(String[] args) {
		try {
			int number1 = 3;
			int number2 = 4;
			int result = number2/number1;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			System.out.println("Don't divide a numbeer by zero");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("this is due to null pointer exception");	
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Drink a lemon juice and don't divide a number by zero");
		}

	}

}
