package com.jdc.app.run;

public class Lottery2D3D {

	private String lottery;
	private int amount;

	public Lottery2D3D(String lottery, int amount) {
		this.lottery = lottery;
		this.amount = amount;
	}

	public String getLottery() {
		return lottery;
	}

	public int getAmount() {
		return amount;
	}

	public String toString() {
		return lottery + ": " + amount;
	}
	
}

// Lottery2D3D twoD = new Lottery2D3D(15, 10000);