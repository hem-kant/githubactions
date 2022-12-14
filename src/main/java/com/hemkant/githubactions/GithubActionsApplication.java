package com.hemkant.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

	@GetMapping("/hello")
	public  String HelloWorld(){
		return "Hello from GCP K8s cluster";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}

}
