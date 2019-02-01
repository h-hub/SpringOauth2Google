package com.harsha.spmvc.mvcauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/sample")
    public String showForm() {
        return "test";
    }
	
	@GetMapping("/")
    public String showGoogleAuth() {
        return "test";
    }
}
