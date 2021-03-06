package com.example.BillingSystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.JobLauncherCommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableSwagger2
public class BillingSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BillingSystemApplication.class, args);
	}

	
	@Bean
	public RestTemplate createBean() {
		
		return new RestTemplate();
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
