package com.example;

import com.example.controller.EndpointsController;
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

@WebMvcTest(EndpointsController.class)
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc(secure=false)
public class EndpointsControllerTests {

    @Autowired
    private
    MockMvc mvc;

    @Test
    public void testpiValue() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/math/pi");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("3.141592653589793"));

    }
}
