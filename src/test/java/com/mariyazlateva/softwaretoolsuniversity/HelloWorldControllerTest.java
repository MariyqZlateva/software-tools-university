package com.mariyazlateva.softwaretoolsuniversity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class HelloWorldControllerTest {

    HelloWorldController helloWorldController;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        helloWorldController = new HelloWorldController();
        mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController).build();
    }

    @Test
    void getHelloWorldMessage() throws Exception {
        mockMvc.perform(get("http://localhost:8080"))
                .andExpect(status().isOk());
    }
}