package com.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;





@SpringBootApplication
@ComponentScan(basePackages= {"com.quanlinhansu.springmvc.configs","com.quanlinhansu.springmvc.controller,com.quanlinhansu.springmvc.model"})
public class Application {
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		}
		
	}

