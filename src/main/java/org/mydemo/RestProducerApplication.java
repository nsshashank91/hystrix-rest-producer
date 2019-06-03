package org.mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class RestProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestProducerApplication.class, args);
	}
	
	@RequestMapping("/greet/{username}")
	public String greeting(@PathVariable("username") String username) {
		return String.format("Hello %s!", username);
	}
}
