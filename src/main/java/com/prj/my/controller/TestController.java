package com.prj.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/index")
	public String main() {
		return "index";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
