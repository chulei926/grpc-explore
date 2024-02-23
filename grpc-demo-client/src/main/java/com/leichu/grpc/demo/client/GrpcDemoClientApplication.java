package com.leichu.grpc.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
public class GrpcDemoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcDemoClientApplication.class, args);
	}

}
