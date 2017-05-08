package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebMvcTest(HelloController.class)
@RunWith(SpringRunner.class)
public class HelloControllerTest {

    @Autowired
    private
    MockMvc mvc;

    @Test
    public void helloWorld() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Hello from Spring!"));

    }

    @Test
    public void testTestString() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/test");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Testing"));
    }

    @Test
    public void testAbout() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/about");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("About - Wakeupsid"));
    }

    @Test
    public void testContact() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/contact");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Contact - wakeupsid9 :)"));
    }
}
