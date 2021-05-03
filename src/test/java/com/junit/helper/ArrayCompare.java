package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompare {

	@Test
	public void testArraysSort() {

		int[] numbers = { 212, 33, 1, 104 };
		int[] expected = { 1, 33, 104, 212 };
		Arrays.sort(numbers);
		// assertEquals(..) cant be used here, it compares the object not the numbers in
		// array
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraysSort_testException() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}

	//if sorting is not completd in 100ms, test will fail.
	@Test(timeout = 100)
	public void testArraysSort_TestPerformance() {
		int[] numbers = { 212, 33, 1, 104 };
		for (int i = 1; i < 100000; i++) {
			numbers[0] = i;
			Arrays.sort(numbers);
		}
	}

}
