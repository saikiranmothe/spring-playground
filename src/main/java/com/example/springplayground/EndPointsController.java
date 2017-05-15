package com.example.springplayground;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by saikiranmothe on 5/15/17.
 */

@RestController
@RequestMapping
//@RequestMapping("/app")
public class EndPointsController {

    @GetMapping("/")
    public String getIndex() {
        return "GET to index route";
    }

    @GetMapping("math/pi")
    public String getPiValue() {
        return "3.141592653589793";
    }

    @GetMapping("vehicles?year=1987&doors=2")
    public String getIndexEndpoint() {
        return "Sample Query string";
    }

    @GetMapping("/tasks")
    public String getTasks() {
        return "These are tasks";
    }

    @PostMapping("/tasks")
    public String createTask() {
        return "You just POSTed to /tasks";
    }

    @GetMapping("/foo")
    public String getFoo() {
        return "foo";
    }

    @GetMapping("/bar")
    public String getBar() {
        return "bar";
    }

    @PostMapping("/question")
    public String getQuestion() {
        return "Nailed it!";
    }






}
