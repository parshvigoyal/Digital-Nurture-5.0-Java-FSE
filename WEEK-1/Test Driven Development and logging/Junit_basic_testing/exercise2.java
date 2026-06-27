package module_4_test_driven_development_and_logging_framework.Junit_basic_testing;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(10, c.add(4, 6));
    }
}