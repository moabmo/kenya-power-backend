package com.kenyapower.reportapp;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ReportappApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReportappApplication.class, args);
	}
}

