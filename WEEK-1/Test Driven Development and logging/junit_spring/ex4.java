package module_4_test_driven_development_and_logging_framework.junit_spring;

@SpringBootTest
class IntegrationTest {

    @Autowired
    UserService service;

    @Test
    void testApplicationFlow() {
        assertNotNull(service);
    }
}
