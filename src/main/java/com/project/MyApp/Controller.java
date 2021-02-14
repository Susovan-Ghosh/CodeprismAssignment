package com.project.MyApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello_world")
    public String helloWorld() {
        return "hello world";
    }
}
