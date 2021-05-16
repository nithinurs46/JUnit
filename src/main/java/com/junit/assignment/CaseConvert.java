package com.junit.assignment;

public class CaseConvert {
	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("ArisGlobal");
		String convertedCase = convertCase(str);
		System.out.println("Converted String: " + convertedCase);
	}

	public static String convertCase(StringBuffer str) {
		int length = str.length();
		for (int i = 0; i < length; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c)) {
				str.replace(i, i + 1, Character.toUpperCase(c) + "");
			} else {
				str.replace(i, i + 1, Character.toLowerCase(c) + "");
			}

		}
		return str.toString();
	}
}
