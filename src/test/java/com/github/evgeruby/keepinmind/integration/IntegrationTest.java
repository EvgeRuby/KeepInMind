package com.github.evgeruby.keepinmind.integration;

import com.github.evgeruby.keepinmind.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = Application.class)
@ContextConfiguration(classes = Application.class)
@AutoConfigureMockMvc
@ActiveProfiles("test")
class IntegrationTest {


    @Autowired
    private MockMvc mvc;

    @Test
    void initialization_test() throws Exception {
        // when
        ResultActions resultActions = mvc.perform(
                get("/health")
        );

        // then
        resultActions
                .andExpect(status().isOk())
                .andExpect(jsonPath("status", is("ok")));
    }
}
