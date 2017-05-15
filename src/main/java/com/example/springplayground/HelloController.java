package com.example.springplayground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by saikiranmothe on 5/15/17.
 */

@RestController
public class HelloController {


    @GetMapping("/test")
    public String sample() {
        return "Testing";
    }


    @GetMapping("/about")
    public String about() {
        return "About - Wakeupsid";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact - wakeupsid9 :)";
    }
}
