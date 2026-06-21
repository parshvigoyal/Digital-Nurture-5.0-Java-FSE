package module_4_test_driven_development_and_logging_framework.junit_spring;

@SpringBootTest
class CalculatorServiceTest {

    @Autowired
    CalculatorService service;

    @Test
    void testAdd() {
        assertEquals(10, service.add(4, 6));
    }
}