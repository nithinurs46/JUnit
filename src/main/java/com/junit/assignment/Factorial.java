package com.junit.assignment;

public class Factorial {
	public static void main(String[] args) {
		int number = 5;
		int fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}