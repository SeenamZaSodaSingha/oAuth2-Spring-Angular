package com.programming.techie.pkce.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
@CrossOrigin(origins = "*")
public class Controller {
    
    @GetMapping
    // @ResponseStatus(HttpStatus.OK)
    public String home() {
        System.out.println("Home is called");
        return "Hello World";
    }
}
