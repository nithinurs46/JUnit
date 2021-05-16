package com.junit.assignment;

public class LowerCaseLetters {
	public static void main(String[] args) {
		String str = "abcd";
		boolean onlyLowerCase = checkForLowerCaseString(str);
		if (onlyLowerCase) {
			System.out.println(str + " contains only lower case letters");
		} else {
			System.out.println(str + " does not contain only lower case letters");
		}

	}

	public static boolean checkForLowerCaseString(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (!Character.isLowerCase(charArray[i]))
				return false;
		}
		return true;
	}

}
