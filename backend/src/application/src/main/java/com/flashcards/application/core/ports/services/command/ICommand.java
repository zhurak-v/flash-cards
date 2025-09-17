package com.flashcards.application.core.ports.services.command;

import java.util.List;

public interface ICommand {
    void execute(String command);
    List<String> getCommands();
}
