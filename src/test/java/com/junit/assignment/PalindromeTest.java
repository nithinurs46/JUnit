package com.junit.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void test_validPalindrome1() {
		assertEquals(true, Palindrome.checkPalindrome("Radar"));
	}

	@Test
	public void test_invalidPalindrome1() {
		assertEquals(false, Palindrome.checkPalindrome("River"));
	}

	@Test
	public void test_validPalindrome2() {
		assertTrue(Palindrome.checkPalindrome("RaceCar"));
	}

	@Test
	public void test_invalidPalindrome2() {
		assertFalse(Palindrome.checkPalindrome("ArisGlobal"));
	}

}
