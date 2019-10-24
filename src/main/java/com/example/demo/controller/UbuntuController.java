package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ubuntu")
public class UbuntuController {
	@GetMapping("/hello")
	public String hiUbuntu() {
		return "hi ubuntu";
		
	}

}
