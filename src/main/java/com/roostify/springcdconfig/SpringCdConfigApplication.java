package com.roostify.springcdconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCdConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCdConfigApplication.class, args);
	}
}
