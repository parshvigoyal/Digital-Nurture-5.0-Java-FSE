package module_4_test_driven_development_and_logging_framework.junit_spring;

@ParameterizedTest
@CsvSource({
    "2,3,5",
    "5,5,10",
    "1,4,5"
})
void testAdd(int a, int b, int result) {
    assertEquals(result,
            new CalculatorService().add(a,b));
}}
