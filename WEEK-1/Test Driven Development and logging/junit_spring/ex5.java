package module_4_test_driven_development_and_logging_framework.junit_spring;

@Test
void testCreateUser() throws Exception {

    mockMvc.perform(post("/users")
            .contentType("application/json")
            .content("{\"name\":\"Rahul\"}"))
            .andExpect(status().isOk());
}