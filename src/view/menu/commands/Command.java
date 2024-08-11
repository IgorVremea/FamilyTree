package view.menu.commands;

import view.ConsoleUI;

public abstract class Command {
    String description;
    ConsoleUI consoleUI;
    Command(String description, ConsoleUI consoleUI){
        this.description = description;
        this.consoleUI = consoleUI;
    }
    public abstract void execute();
    public String getDescription(){
        return description;
    }
    public ConsoleUI getConsoleUI(){
        return consoleUI;
    }
}
