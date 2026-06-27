package module_4_test_driven_development_and_logging_framework.Junit_basic_testing;

import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 7, b = 3;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(10, result);
    }

    @After
    public void teardown() {
        calc = null;
    }
}