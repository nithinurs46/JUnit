package com.junit.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordValidatorTest {

	@Test
	public void testOnlyUpperCase() {
		assertFalse(PasswordValidator.validatePwd("HAHA"));
	}

	@Test
	public void testOnlyLowerCase() {
		assertFalse(PasswordValidator.validatePwd("abcd"));
	}

	@Test
	public void testValidPwd() {
		assertTrue(PasswordValidator.validatePwd("A1b"));
	}

	@Test
	public void testInvalidPwd() {
		assertEquals(false, PasswordValidator.validatePwd("AB1"));
	}

}
