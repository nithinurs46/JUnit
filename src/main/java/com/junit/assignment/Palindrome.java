package com.junit.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str = "RaceCar";
		if (checkPalindrome(str)) {
			System.out.print(str + " is a palindrome");
		} else {
			System.out.print(str + " is not a palindrome");
		}

	}

	public static boolean checkPalindrome(String str) {
		str = str.toLowerCase();
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
