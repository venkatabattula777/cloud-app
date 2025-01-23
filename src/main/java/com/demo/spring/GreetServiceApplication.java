package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class GreetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetServiceApplication.class, args);
	}

	@GetMapping(path="/greet")
	public String greet() {
		return "If you see me, you have done it!!";
	}
}
