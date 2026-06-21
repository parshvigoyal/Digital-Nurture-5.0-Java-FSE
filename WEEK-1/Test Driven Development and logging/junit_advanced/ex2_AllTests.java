package module_4_test_driven_development_and_logging_framework.junit_advanced;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({EvenCheckerTest.class, ex3_OrderedTests.class})
public class ex2_AllTests {
}