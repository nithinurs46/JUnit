package com.junit.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFactorialOf_0() {
		assertEquals(1, Factorial.factorial(0));
	}

	@Test
	public void testFactorialOf_1() {
		assertEquals(1, Factorial.factorial(1));
	}

	@Test
	public void testFactorialOf_2() {
		assertEquals(2, Factorial.factorial(2));
	}

	@Test
	public void testFactorialOf_3() {
		assertEquals(6, Factorial.factorial(3));
	}

}
