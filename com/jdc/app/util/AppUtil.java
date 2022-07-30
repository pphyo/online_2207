package com.jdc.app.util;

import java.util.Scanner;

public class AppUtil {
	
	public final static Scanner sc = new Scanner(System.in);

	public static void showMessage(String message) {

		String line = ""; // *******

		for(int i = 0; i < message.length(); i++) {
			line += "*";
		}

		System.out.println("**".concat(line).concat("**"));
		System.out.println("* ".concat(message).concat(" *"));
		System.out.println("**".concat(line).concat("**"));

	}

	public static void showMenu(String[] menus) {
		for(int i = 0; i < menus.length; i++)
			System.out.println(i + 1 + ". " + menus[i]);
	}

	public static String getString(String message) {
		System.out.print(message);
		return sc.nextLine();
	}

	public static int getInt(String message) {
		return Integer.parseInt(getString(message));
	}

}