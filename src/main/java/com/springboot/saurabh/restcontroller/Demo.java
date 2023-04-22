package com.springboot.saurabh.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Demo {
	
	@GetMapping("/message")
	public String getmessage() {
		return "Welcome To Docker Hub ...";
	}
}
