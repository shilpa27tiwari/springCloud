package com.springeurekademo.SpringEurekaServiceDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServiceDemoApplication.class, args);
	}

}
