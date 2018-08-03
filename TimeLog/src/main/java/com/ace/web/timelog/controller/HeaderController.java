package com.ace.web.timelog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/header")
public class HeaderController {

	@GetMapping
	public String loginPage() {
		return "Header";
		
	}
	
}
