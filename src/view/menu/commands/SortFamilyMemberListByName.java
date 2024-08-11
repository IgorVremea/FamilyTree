package view.menu.commands;

import view.ConsoleUI;

public class SortFamilyMemberListByName extends Command{

    public SortFamilyMemberListByName(ConsoleUI consoleUI) {
        super("Sort family member list by name", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortFamilyMemberListByName();
    }
}
