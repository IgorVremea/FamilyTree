package view.menu.commands;

import view.ConsoleUI;

public class SortFamilyMemberListByAge extends Command{

    public SortFamilyMemberListByAge(ConsoleUI consoleUI) {
        super("Sort family meber list by age", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortFamilyMemberListByAge();
    }
}
