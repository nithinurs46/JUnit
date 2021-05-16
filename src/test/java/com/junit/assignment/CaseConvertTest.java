package com.junit.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaseConvertTest {

	@Test
	public void test_convert1() {
		assertEquals("aRISgLOBAL", CaseConvert.convertCase(new StringBuffer("ArisGlobal")));
	}

	@Test
	public void test_convert2() {
		assertEquals("bANGALORE", CaseConvert.convertCase(new StringBuffer("Bangalore")));
	}

	@Test
	public void test_convert3() {
		assertEquals("eXCHANGE", CaseConvert.convertCase(new StringBuffer("Exchange")));
	}

	@Test
	public void test_convert4() {
		assertEquals("jAVAsCRIPT", CaseConvert.convertCase(new StringBuffer("JavaScript")));
	}

}
