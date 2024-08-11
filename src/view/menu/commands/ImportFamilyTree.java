package view.menu.commands;

import view.ConsoleUI;

public class ImportFamilyTree extends Command{
    public ImportFamilyTree(ConsoleUI consoleUI) {
        super("Import family tree", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().importFamilyTree();
    }
}
