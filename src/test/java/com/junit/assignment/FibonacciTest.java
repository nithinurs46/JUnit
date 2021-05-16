package com.junit.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {
	static int number = 15;
	static int fibArr[] = new int[number];

	@BeforeClass
	public static void getFibonacciSeries() {
		fibArr = Fibonacci.generateFibonacciSeq(number);
	}

	@Test
	public void testFibonacciFor_0() {
		assertEquals(0, Fibonacci.getNthNoFromFibSequence(fibArr, 1));
	}

	@Test
	public void testFibonacciFor_1() {
		assertEquals(1, Fibonacci.getNthNoFromFibSequence(fibArr, 3));
	}

	@Test
	public void testFibonacciFor_3() {
		assertEquals(3, Fibonacci.getNthNoFromFibSequence(fibArr, 5));
	}

	@Test
	public void testFibonacciFor_8() {
		assertEquals(8, Fibonacci.getNthNoFromFibSequence(fibArr, 7));
	}

}
