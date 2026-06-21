package module_4_test_driven_development_and_logging_framework.junit_spring;

@Mock
UserRepository repository;

@InjectMocks
UserService service;

@Test
void testGetUserById() {
    User user = new User();
    user.setId(1L);
    user.setName("Rahul");

    when(repository.findById(1L))
            .thenReturn(Optional.of(user));

    assertEquals("Rahul",
            service.getUserById(1L).getName());
}
