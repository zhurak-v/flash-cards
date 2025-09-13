package com.flashcards.profile.service;

import org.springframework.stereotype.Service;

@Service
public class ProfileServices {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
