package module_4_test_driven_development_and_logging_framework.junit_advanced;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ex1_EvenCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void testEvenNumbers(int n) {
        assertTrue(new ex1_EvenChecker().isEven(n));
    }
}