/**
 * Created by saikiranmothe on 5/2/17.
 */


package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointController {

    @GetMapping("/math/pi")
    public String pivalue() {
        return "3.141592653589793";
    }
}