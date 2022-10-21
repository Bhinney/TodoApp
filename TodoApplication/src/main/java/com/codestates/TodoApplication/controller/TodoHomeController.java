package com.codestates.TodoApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoHomeController {

    @GetMapping("/")
    public String helloWorld(){
        return "To-Do Application !";
    }
}
