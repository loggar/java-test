package com.loggar.test.junit4.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ExFirstTest.class, ExSecondTest.class })
public class JunitAllTests {
	// empty, just holder for annotations
	// run test of this class
}