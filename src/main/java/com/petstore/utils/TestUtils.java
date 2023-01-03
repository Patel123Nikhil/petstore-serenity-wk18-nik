package com.petstore.utils;

import java.util.Random;

public class TestUtils {
	/**
	 * This method will generate random number
	 */
	public static int getRandomNumber(){
		Random random = new Random();
		int randomInt = random.nextInt(10000);
		return randomInt;
		//return Integer.toString(randomInt);
	}
	/**
	 * This method will generate random string
	 */
	public static String getRandomString() {
		int length = 7;
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
}
