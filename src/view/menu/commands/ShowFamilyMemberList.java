package view.menu.commands;

import view.ConsoleUI;

public class ShowFamilyMemberList extends Command{

    public ShowFamilyMemberList(ConsoleUI consoleUI) {
        super("Show family member list", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().printStr(getConsoleUI().getFamilyMemberList());
    }
}
