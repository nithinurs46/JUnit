/**
 * 
 */
package com.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println(
				"Methods with @BeforeClass annotation gets called only once at the beginning, method should be static else exception is thrown");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println(
				"Methods with @AfterClass annotation gets called only once at the end, method should be static else exception is thrown");
	}

	@Before
	public void setup() {
		System.out.println("Methods with @Before annotation gets called before each test method is executed");
	}

	@After
	public void tearDown() {
		System.out.println("Methods with @After annotation gets called after each test method is executed");
	}

	StringHelper helper = new StringHelper();

	/**
	 * Test method for
	 * {@link com.junit.helper.StringHelper#truncateAInFirst2Positions(java.lang.String)}.
	 */
	// test methods should always be public and void
	@Test
	public void testTruncateAInFirst2Positions_twoCharsOnly() {
		assertEquals("B", helper.truncateAInFirst2Positions("AB")); // expectedValue, actualValue

	}

	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Pos() {
		assertEquals("CC", helper.truncateAInFirst2Positions("CAC"));

	}

	@Test
	public void testTruncateAInFirst2Positions_NoA() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}

	/**
	 * Test method for
	 * {@link com.junit.helper.StringHelper#areFirstAndLastTwoCharactersTheSame(java.lang.String)}.
	 */
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NotSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("CCDD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Same2CharsOnly() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_SameMoreThen2Chars() {
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("ABDDEAB"));
	}

}
