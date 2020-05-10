package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/")
	public String returnHello()
	{
		return "Just Retesting with Automated CICD ...Pleaes Observe";
	}
}
