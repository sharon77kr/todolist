package com.jip.todolist_jip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;

@EntityScan(basePackages = { "com.jip.todolist_jip"} )
@SpringBootApplication(
		exclude = {
				HttpEncodingAutoConfiguration.class,
				MultipartAutoConfiguration.class
		}
)
public class TodolistJipApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistJipApplication.class, args);
	}

}
