package com.signup.signUp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class SingUp {

	
	@RequestMapping("/test")
	public String getSignUp() {
		return "hello sign up ";
	}
}
