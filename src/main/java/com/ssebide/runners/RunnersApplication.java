package com.ssebide.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnersApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnersApplication.class, args);
	}

	// @Bean
	// CommandLineRunner runner(){
	// 	return args -> {
	// 		Run run = new Run(1, "First run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 3, Location.OUTDOOR);
	// 		log.info("Run: " + run);
	// 	};
	// }

}
