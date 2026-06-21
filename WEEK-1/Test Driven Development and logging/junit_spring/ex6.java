package module_4_test_driven_development_and_logging_framework.junit_spring;

@Test
void testUserNotFound() {

    when(repository.findById(5L))
            .thenReturn(Optional.empty());

    assertNull(service.getUserById(5L));
}