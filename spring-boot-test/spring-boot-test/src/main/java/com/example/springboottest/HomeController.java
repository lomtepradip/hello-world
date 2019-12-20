package com.example.springboottest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(path="/all")
	public String home() {
		return "hello word from home controller";
	}
}
