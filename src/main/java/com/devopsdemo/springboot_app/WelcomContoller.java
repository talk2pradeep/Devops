package com.devopsdemo.springboot_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomContoller {
    @GetMapping("/welcome")
    public String welcome(){
      return "Welcome to spring boot";
    }
}
