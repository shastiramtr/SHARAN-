package com.learn.javalearning;

public class ReturntypeCollectAmount {

	public Integer collectedamount=2000;

	public Integer collectamountanggiveittome() {
		System.out.println("I have collected amount"+ collectedamount);
		return collectedamount;
	}


	public static void main(String[] args) {
		// Return Types
		ReturntypeCollectAmount ram = new ReturntypeCollectAmount();
		Integer amount= ram.collectamountanggiveittome();
		System.out.println("Got the amount ram"+amount);

	}

}
