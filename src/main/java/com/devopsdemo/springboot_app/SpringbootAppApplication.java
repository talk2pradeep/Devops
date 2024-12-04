package com.devopsdemo.springboot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAppApplication {

	@GetMapping("/start")
	public  String start(){
		return "welcome to spring boot- updated";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppApplication.class, args);
	}

}
