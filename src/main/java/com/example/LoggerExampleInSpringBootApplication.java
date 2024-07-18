package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerExampleInSpringBootApplication {
private static final Logger logger = LoggerFactory.getLogger(LoggerExampleInSpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggerExampleInSpringBootApplication.class, args);
		logger.info("this is info logger");
		logger.warn("this is a warn message");
		logger.debug("this is a debug message",new Throwable("this is a error"));
	}

}
