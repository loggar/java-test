package com.loggar.test.junit5.suites;

import com.loggar.test.junit5.assertions.LinearSearcherTest;
import com.loggar.test.junit5.hamcrest.ArrayAssertionTest;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ ArrayAssertionTest.class, LinearSearcherTest.class })
public class AllTests2 {

}
