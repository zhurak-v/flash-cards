package com.flashcards.user.service;

import org.springframework.stereotype.Service;

@Service
public class UserServices {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
