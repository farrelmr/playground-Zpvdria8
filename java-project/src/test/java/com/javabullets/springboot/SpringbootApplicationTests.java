package com.javabullets.springboot;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SpringbootApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void myFirstSpringBootApplication() throws Exception {
        mockMvc.perform(get("/myFirstSpringBootApplication"))
                .andExpect(content().string(containsString("Well done creating your first Spring Boot Application")));
				
    }

}
