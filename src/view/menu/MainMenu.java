package view.menu;

import view.ConsoleUI;
import view.menu.commands.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends Menu {
    public MainMenu(ConsoleUI consoleUI){
        commands = new ArrayList<>();
        commands.add(new ShowFamilyMemberList(consoleUI));
        commands.add(new AddTestFamilyMemberList(consoleUI));
        commands.add(new SortFamilyMemberListByName(consoleUI));
        commands.add(new SortFamilyMemberListByAge(consoleUI));
        commands.add(new ImportFamilyTree(consoleUI));
        commands.add(new ExportFamilyTree(consoleUI));
        commands.add(new Finish(consoleUI));

    }

    @Override
    public String menu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Choose an option:\n");
        for(int i = 0; i < commands.size(); i++){
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public void execute(int choice) {
        commands.get(choice-1).execute();
    }
}
