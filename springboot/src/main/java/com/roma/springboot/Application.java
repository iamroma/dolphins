package com.roma.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by roma on 20/04/2017.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = getSpringApplication();
        app.run(args);
    }

    private static SpringApplication getSpringApplication() {
        return new SpringApplication(Application.class);
    }
}
