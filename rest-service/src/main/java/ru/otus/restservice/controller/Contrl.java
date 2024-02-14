package ru.otus.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Contrl {
    @GetMapping("/")
    public String api (){
        return "Hello user via api";
    }
}
