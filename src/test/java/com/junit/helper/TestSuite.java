package com.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ StringHelperParameterizedTest.class, StringHelperTest.class })
public class TestSuite {
//test suite allows us to select the classes the need to be run as Junit test.
// In this ex, we have included only 2 classes to be run as Junit test
// right click and run this class as normal junit test
}
