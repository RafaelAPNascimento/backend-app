package com.finalexception.backendapp.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class AppInfo {
	
	@GetMapping
	public String getInfo() {
		return "App Info";
	}

}
