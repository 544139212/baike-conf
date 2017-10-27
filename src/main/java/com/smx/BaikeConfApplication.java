package com.smx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BaikeConfApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaikeConfApplication.class, args);
	}
}
