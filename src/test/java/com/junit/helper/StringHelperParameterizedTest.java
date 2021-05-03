/**
 * 
 */
package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	// rather then creating multiple methods to test different values,
	// we can use Parameterized class, create an array of parameters and pass it.
	StringHelper helper = new StringHelper();
	private String input;
	private String expected;

	public StringHelperParameterizedTest(String input, String expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<String[]> inputAndExpectedValues() {
		// create an array of actual,expected values
		String inputAndExpectedArr[][] = { { "AB", "B" }, { "CAC", "CC" }, { "CDEF", "CDEF" } };
		return Arrays.asList(inputAndExpectedArr);
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expected, helper.truncateAInFirst2Positions(input)); // expectedValue, actualValue

	}

}
