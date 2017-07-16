package org.poc.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;


@RestController
@RequestMapping("/api")
@Api(value="about", description="Spring Boot with Swagger implementation")
public class AboutApplication {

	@GetMapping("/about")
	public String aboutApplication() {
		return "Micro services example - application";
	}
}
