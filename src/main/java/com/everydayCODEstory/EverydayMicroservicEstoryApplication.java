package com.everydayCODEstory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "hello")
public class EverydayMicroservicEstoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EverydayMicroservicEstoryApplication.class, args);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{userName}")
	public String sayHello(@PathVariable("userName") String userName) {
		return "Hello " + userName + " Welcome to Microservices";
	}
}
