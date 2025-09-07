package org.flashcards.backend;

import org.flashcards.backend.model.FlashCard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        FlashCard fc = new FlashCard("Business", "Money");

        System.out.println("Question: " + fc.getQuestion() + "\tAnswer: " + fc.getAnswer());

        SpringApplication.run(BackendApplication.class, args);
    }

}
