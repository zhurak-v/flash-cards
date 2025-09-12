package com.flashcards.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flashcards.user.service.UserServices;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println(UserServices.greet("Flashcards"));
        SpringApplication.run(Application.class, args);
    }

}
