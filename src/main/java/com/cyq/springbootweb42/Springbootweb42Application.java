package com.cyq.springbootweb42;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cyq.springbootweb42")
@SpringBootApplication
public class Springbootweb42Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootweb42Application.class, args);
    }
}
