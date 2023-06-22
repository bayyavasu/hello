package com.exl.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
               
	@GetMapping("/hello")
	public String hello()
	{
		return "hello  dd  dd   ";
	}
	
	@GetMapping("/hello1")
	public String hello1()
	{
		return "hello  dd  dd   ";
	}
}
