package com.junit.assignment;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class PrimeNumberTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testPrimeFor_1() {
		assertFalse(PrimeNumber.checkPrime(1));
	}

	@Test
	public void testPrimeFor_2() {
		assertTrue(PrimeNumber.checkPrime(2));
	}

	@Test
	public void testPrimeFor_3() {
		assertTrue(PrimeNumber.checkPrime(3));
	}

	@Test
	public void testPrimeFor_4() {
		assertFalse(PrimeNumber.checkPrime(4));
	}

	@Test
	public void testPrimeFor_5() {
		assertTrue(PrimeNumber.checkPrime(5));
	}

	@Test
	public void testPrimeFor_6() {
		assertFalse(PrimeNumber.checkPrime(6));
	}

}
