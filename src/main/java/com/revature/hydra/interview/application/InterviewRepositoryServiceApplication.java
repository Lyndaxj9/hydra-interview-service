package com.revature.hydra.interview.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;


@Controller
@EnableAutoConfiguration
@EnableJpaRepositories("com.revature.hydra.interview.data")
@ComponentScan(basePackages = {"com.revature.hydra.interview.controller", "com.revature.hydra.interview.service"})
@EntityScan("com.revature.beans")
public class InterviewRepositoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewRepositoryServiceApplication.class, args);
	}
}
