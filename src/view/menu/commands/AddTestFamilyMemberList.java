package view.menu.commands;

import view.ConsoleUI;

public class AddTestFamilyMemberList extends Command{
    public AddTestFamilyMemberList(ConsoleUI consoleUI) {
        super("Add test family members", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addTestMembers();
    }
}
