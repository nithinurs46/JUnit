package com.junit.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class LowerCaseLettersTest {

	@Test
	public void test_upperAndLowerCaseLetters() {
		assertFalse(LowerCaseLetters.checkForLowerCaseString("Abcd"));
	}

	@Test
	public void test_onlyLowerCaseLetters() {
		assertTrue(LowerCaseLetters.checkForLowerCaseString("abcd"));
	}

	@Test
	public void test_lowerCaseLettersAndNumber() {
		assertFalse(LowerCaseLetters.checkForLowerCaseString("abc1d"));
	}

	@Test
	public void test_lowerCaseLettersAndSplChar() {
		assertEquals(false, LowerCaseLetters.checkForLowerCaseString("abc#d"));
	}

}
