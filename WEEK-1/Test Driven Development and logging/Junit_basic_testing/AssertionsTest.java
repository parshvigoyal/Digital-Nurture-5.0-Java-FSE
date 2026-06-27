package module_4_test_driven_development_and_logging_framework.Junit_basic_testing;
import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(8, 5 + 3);
        assertTrue(20 > 10);
        assertFalse(10 < 5);
        assertNull(null);
        assertNotNull("JUnit");
    }
}