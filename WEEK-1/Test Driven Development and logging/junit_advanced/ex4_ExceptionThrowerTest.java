package module_4_test_driven_development_and_logging_framework.junit_advanced;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ex4_ExceptionThrowerTest {

    @Test
    void testException() {
        assertThrows(ArithmeticException.class,
                () -> new ExceptionThrower().throwException());
    }
}