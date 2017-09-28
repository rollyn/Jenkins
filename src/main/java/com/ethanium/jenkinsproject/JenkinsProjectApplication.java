package com.ethanium.jenkinsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

	@RequestMapping("/")
	public String get() {
		return "Jenkins Testing";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Jenkins";
	}
}
