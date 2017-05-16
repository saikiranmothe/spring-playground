package com.example.springplayground;

/**
 * Created by saikiranmothe on 5/16/17.
 */


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/words")
public class WordCounterController {

    private WordCounter wordCounter;

    public WordCounterController(WordCounter wordCounter) {
        assert( this.wordCounter != null );
        this.wordCounter = wordCounter;
    }

    @PostMapping("/count")
    public Map<String, Integer> getWordCount(@RequestBody String input) {
        Map<String, Integer> test = this.wordCounter.countWords(input);
        return test;
    }

}