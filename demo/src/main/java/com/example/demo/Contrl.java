package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/testapp")
@RestController
public class Contrl {
    @Autowired
    ApplicationService appService;

    @GetMapping("/get/admin")
    public String adam (){
        return "Hello admin";
    }
    @GetMapping("/get/user")
    public String user (){
        return "Hello user";
    }
    @GetMapping("/get/api")
    public String api (){
        try {
            return appService.sayHello();
        } catch (Exception e) {
            return "Error while calling sayHello: " + e.getMessage();
        }
    }
}


