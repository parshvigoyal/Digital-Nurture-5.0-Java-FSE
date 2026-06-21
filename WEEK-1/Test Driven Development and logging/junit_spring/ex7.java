package module_4_test_driven_development_and_logging_framework.junit_spring;

@Test
void testFindByName() {

    List<User> users =
            repository.findByName("Rahul");

    assertNotNull(users);
}