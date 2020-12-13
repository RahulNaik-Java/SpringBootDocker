package com.rahul.naik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rahul.naik")
public class SpringBootServiceWithDockerApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootServiceWithDockerApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiceWithDockerApplication.class, args);
	}

}
