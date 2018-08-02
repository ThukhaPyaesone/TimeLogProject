package com.ace.web.timelog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/createProject")
public class CreateProjectController {

	@GetMapping
	public String createProjectPage() {
		return "createProject";
		
	}
}
