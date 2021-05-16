package com.junit.assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	public static void main(String[] args) {
		boolean isValidPwd = PasswordValidator.validatePwd("HAHA");
		System.out.println(isValidPwd);
		isValidPwd = PasswordValidator.validatePwd("abcd");
		System.out.println(isValidPwd);
		isValidPwd = PasswordValidator.validatePwd("A1b");
		System.out.println(isValidPwd);
		isValidPwd = PasswordValidator.validatePwd("AB1");
		System.out.println(isValidPwd);

	}

	public static boolean validatePwd(String pwd) {
		if (pwd == null || "".equals(pwd)) {
			return false;
		}
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(pwd);
		return m.matches();
	}
}
