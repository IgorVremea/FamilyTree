package view.menu.commands;

import view.ConsoleUI;

public class ExportFamilyTree extends Command{
    public ExportFamilyTree(ConsoleUI consoleUI) {
        super("Export family tree", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().exportFamilyTree();
    }
}
