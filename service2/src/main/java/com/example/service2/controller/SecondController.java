package com.example.service2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class SecondController {

	@GetMapping("/message")
	public String test() {
		return "Hello Called in Second Service";
	}
}
