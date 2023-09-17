package com.Constrcutive.OnlineStudent.OnlineStudent;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return " Welcome to SpringBoot!...";
	}
}
