package module_4_test_driven_development_and_logging_framework.junit_advanced;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ex3_OrderedTests {

    @Test
    @Order(1)
    void firstTest() {
        System.out.println("First");
    }

    @Test
    @Order(2)
    void secondTest() {
        System.out.println("Second");
    }
}
