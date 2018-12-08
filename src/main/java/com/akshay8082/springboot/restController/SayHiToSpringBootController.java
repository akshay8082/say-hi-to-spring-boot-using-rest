package com.akshay8082.springboot.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiToSpringBootController {

	
	@RequestMapping("/sayHi")
	public String sayHiThereToSpringBoot() {
		return "Hi there!";
	}
}
