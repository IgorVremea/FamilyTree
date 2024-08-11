package view.menu;

import view.ConsoleUI;
import view.menu.commands.*;

import java.util.List;

public abstract class Menu {
    List<Command> commands;

    public abstract String menu();
    public abstract void execute(int choice);
    public int size(){
        return commands.size();
    }

}
