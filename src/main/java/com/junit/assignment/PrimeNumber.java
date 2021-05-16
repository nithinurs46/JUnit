package com.junit.assignment;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 4;
		boolean isPrime = checkPrime(number);
		System.out.println(number + " is prime: " + isPrime);

		number = 5;
		isPrime = checkPrime(number);
		System.out.println(number + " is prime: " + isPrime);
	}

	public static boolean checkPrime(int n) {
		if (n <= 1) {
			return false;
		} else if (n == 2) {
			return true;
		} else {
			if (n % 2 == 0)
				return false;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
