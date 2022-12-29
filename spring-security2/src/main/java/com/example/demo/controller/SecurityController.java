package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	
	@GetMapping(value="/login")
	public String login() {
		return "login";
	}
	
	
	@GetMapping("/")
	public String showList(Authentication user, Model model) {
		//Authenticationは認証済ログインユーザーのこと
		model.addAttribute("username",user.getName());
		model.addAttribute("authority",user.getAuthorities());
		
		return "user";
	}
}
