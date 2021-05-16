package com.junit.assignment;

import java.util.Arrays;

public class Fibonacci {
	public static void main(String[] args) {
		int fibArr[] = generateFibonacciSeq(15);
		int number = getNthNoFromFibSequence(fibArr, 3);
		System.out.println("Number: " + number);

	}

	public static int[] generateFibonacciSeq(int n) {
		int a = 0;
		int b = 1;
		int fibArray[] = new int[n - 1];
		fibArray[0] = a;
		fibArray[1] = b;
		for (int i = 3; i < n; i++) {
			b = a + b;
			a = b - a;
			fibArray[i - 1] = b;
		}
		Arrays.stream(fibArray).forEach(System.out::println);
		return fibArray;
	}

	public static int getNthNoFromFibSequence(int[] fibArr, int index) {
		int number = -1;
		if (index == 0 || index > fibArr.length) {
			return number;
		} else {
			number = fibArr[index - 1];
		}
		return number;
	}
}
