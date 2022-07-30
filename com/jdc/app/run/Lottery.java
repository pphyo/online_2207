package com.jdc.app.run;

import com.jdc.app.util.AppUtil;

public class Lottery {

	static String[] menus = {"2D", "3D"};
	
	public void run() {

		// do {
			breakLine();
			// Welcome Message
			AppUtil.showMessage("Welcome");
			breakLine();

			// 1. 2D
			// 2. 3D
			AppUtil.showMenu(menus);
			breakLine();

			chooseOption(AppUtil.getInt("Enter option: "));

			// generate lottery number

			// get lottery count

				// get user's lottery number

				// get amount for number

			// check lottery number and user's lottery numbers

			// if win display user's amount
			// else sorry try again

		// } while();

	}

	void chooseOption(int option) {
		switch(option) {
		case 1 -> play2D();
		case 2 -> play3D();
		default -> System.out.println("Wrong Option!");
		}
	}

	void play2D() {
		System.out.println("2D playing");
	}

	void play3D() {
		System.out.println("3D playing");
	}

	void breakLine() {
		System.out.println();
	}
}