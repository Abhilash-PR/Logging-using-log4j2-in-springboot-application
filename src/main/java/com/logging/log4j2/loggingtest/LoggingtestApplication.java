package com.logging.log4j2.loggingtest;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingtestApplication {

	private static final Logger logger = LogManager.getLogger("FileAppender");

	public static void main(String[] args) {
		SpringApplication.run(LoggingtestApplication.class, args);
		logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!");
		logger.error("Oops! We have an Error. OK");
		logger.fatal("Damn! Fatal error. Please fix me.");

	}
}
