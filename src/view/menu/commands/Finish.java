package view.menu.commands;

import view.ConsoleUI;

public class Finish extends Command{
    public Finish(ConsoleUI consoleUI) {
        super("Stop program", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}
