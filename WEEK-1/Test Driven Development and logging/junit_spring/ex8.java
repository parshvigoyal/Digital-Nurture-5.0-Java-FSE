package module_4_test_driven_development_and_logging_framework.junit_spring;

@Test
void testExceptionHandler() {

    assertEquals("User not found",
            new GlobalExceptionHandler()
            .handleNotFound(
            new NoSuchElementException())
            .getBody());
}
