package com.example.springplayground;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by saikiranmothe on 5/15/17.
 */

@WebMvcTest(EndPointsController.class)
@RunWith(SpringRunner.class)
public class EndPointsControllerTest {
    @Autowired
    MockMvc mvc;

    @Test
    public void testIndex() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("GET to index route"));

    }

    @Test
    public void testPIValue() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/math/pi");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("3.141592653589793"));

    }

    @Test
    public void testGetTasks() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/tasks");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("These are tasks"));

    }

    @Test
    public void testPostTasks() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/tasks");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("You just POSTed to /tasks"));

    }

    @Test
    public void testFoo() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/foo");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("foo"));

    }

    @Test
    public void testBar() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/bar");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("bar"));

    }

    @Test
    public void testQuestion() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/question");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Nailed it!"));

    }

    @Test
    public void testIndexEndpoint() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/question");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Nailed it!"));

    }
    
}
