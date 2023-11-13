package com.devopsinsiders.DevOps_Insiders_Java_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsInsidersJavaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsInsidersJavaDemoApplication.class, args);
	}
	@GetMapping("/devopsinsiders")
    	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	      	return String.format("DevOps Insiders Java App is Running.);
	}
}
