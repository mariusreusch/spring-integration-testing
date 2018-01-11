package com.swisscom.iam.sit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swisscom.iam.sit.rest.GreetRestController;
import com.swisscom.iam.sit.rest.GreetingDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetRestController.class)
public class GreetRestControllerTest {

    @Autowired
    MockMvc mvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void name() throws Exception {
        mvc.perform(get("/sayHello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello"));

    }

    @Test
    public void nameAndGreeting_greet_greetingAsJson() throws Exception {
        mvc.perform(get("/greet?name=peterchen&greeting=hej"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\n" +
                        "  \"name\": \"peterchen\",\n" +
                        "  \"greeting\": \"hej\"\n" +
                        "}"));
    }

    @Test
    public void nameAndGreeting_greet_greeting() throws Exception {
        mvc.perform(get("/greet?name=peterchen&greeting=hej"))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(new GreetingDto("peterchen", "hej"))));
    }
}
