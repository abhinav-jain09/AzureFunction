package com.ns.rivier.tokenvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TokenvaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokenvaultApplication.class, args);
	}
	@Bean
	public Hello hello() {
		return new Hello();
	}

}
