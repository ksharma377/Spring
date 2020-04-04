package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping("/")
    public String hello(@RequestParam(value = "name") String inputName) {
        return "Hey, " + inputName + ". How you doin'?";
    }
}
