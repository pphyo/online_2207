package com.jdc.app.run;

import java.util.Random;
import com.jdc.app.util.AppUtil;

public class Lottery {

	static String[] menus = {"2D", "3D"};
	
	public void run() {

		breakLine();
		// Welcome Message
		AppUtil.showMessage("Welcome");

		do {
			breakLine();

			// 1. 2D
			// 2. 3D
			AppUtil.showMenu(menus);
			breakLine();

			chooseOption(AppUtil.getInt("Enter option: "));

		} while(AppUtil.getString("Do yo want to play again?(y/Others): " ).equalsIgnoreCase("y"));

		breakLine();
		AppUtil.showMessage("Thank you for playing.");

	}

	void chooseOption(int option) {
		switch(option) {
		case 1 -> play2D();
		case 2 -> play3D();
		default -> System.out.println("Wrong Option!");
		}
	}

	void play2D() {
		breakLine();
		AppUtil.showMessage("Playing 2D");
		breakLine();
		
		Lottery2D3D[] arr = new Lottery2D3D[99];

		// generate random 2D number
		Random ran = new Random();

		int ranNum = ran.nextInt(100);

		String real2D = "";

		if(ranNum < 10)
			real2D = "0".concat(String.valueOf(ranNum));
		else
			real2D = String.valueOf(ranNum);

		int count = AppUtil.getInt("How many lottery do you want to play?: ");

		int totalAmount = 0;

		for(int i = 0; i < count; i++) {
			breakLine();
			String inputLottery = AppUtil.getString("Enter lottery number: ");
			int amount = AppUtil.getInt("Enter amount: ");

			Lottery2D3D userLottery = new Lottery2D3D(inputLottery, amount);
			arr[i] = userLottery;

		}

		for(int i = 0; i < count; i++) {

			Lottery2D3D obj = arr[i];

			String firstReal2D = real2D.substring(0, 1);
			String secondReal2D = real2D.substring(1);

			String firstUser2D = obj.getLottery().substring(0, 1);
			String secondUser2D = obj.getLottery().substring(1);

			if(real2D.equals(obj.getLottery())) {
				totalAmount += obj.getAmount() * 80;
			} else if(
				firstReal2D.equals(secondUser2D) && secondReal2D.equals(firstUser2D)
				) {

				totalAmount += obj.getAmount() * 50;
			} else if(
				firstReal2D.equals(firstUser2D) || firstReal2D.equals(secondUser2D) ||
				secondReal2D.equals(firstUser2D) || secondReal2D.equals(secondUser2D)
				) {

				totalAmount += obj.getAmount() * 30;
			}
		}

		breakLine();
		AppUtil.showMessage("2D Lottery is <" + real2D + ">");

		if(totalAmount > 0) {
			breakLine();
			System.out.println("Congratulation! You won " + totalAmount +" Kyats.");
		} else {
			breakLine();
			System.out.println("Sorry! play again.");
		}

	}

	void play3D() {
		System.out.println("3D playing");
	}

	void breakLine() {
		System.out.println();
	}
}