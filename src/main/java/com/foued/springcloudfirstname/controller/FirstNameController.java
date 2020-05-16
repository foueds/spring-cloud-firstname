package com.foued.springcloudfirstname.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstNameController {

    @Value("${firstname}")
    String firstName;

    @GetMapping("/")
    public @ResponseBody
    String getWord() {
        String[] wordArray = firstName.split(",");
        int i = (int) Math.round(Math.random() * (wordArray.length - 1));
        return wordArray[i];
    }
}
