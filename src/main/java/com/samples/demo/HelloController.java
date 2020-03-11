package com.samples.demo;

import org.openspaces.core.GigaSpace;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RestController
public class HelloController {

	@Resource
	private GigaSpace gigaSpace;

	@RequestMapping("/")
	public String index() {
		int count = gigaSpace.count(new Object());
		return String.format("Greetings from Spring Boot! There are %d objects in space", count);
	}

}
