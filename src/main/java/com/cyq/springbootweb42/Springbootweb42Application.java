package com.cyq.springbootweb42;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan("com.cyq.springbootweb42")
@SpringBootApplication
@EnableAsync
public class Springbootweb42Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootweb42Application.class, args);
    }
}
