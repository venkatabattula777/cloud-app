package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping("/api")
public class GreetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetServiceApplication.class, args);
	}

	@GetMapping("/greet")
	public String greet() {
		return "If you see me, you have done it!!";
	}
}
