package com.foued.springcloudfirstname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudFirstnameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFirstnameApplication.class, args);
	}

}
