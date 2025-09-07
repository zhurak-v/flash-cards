package org.flashcards.backend.model;

// Main flash card entity
public class FlashCard {
    private Long id;
    private String question;
    private String answer;

    public FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }
    
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
