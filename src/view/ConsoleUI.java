package view;

import model.Humans.Gender;
import presenter.Presenter;
import view.menu.*;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Presenter presenter;
    private Scanner scanner;
    private MainMenu mainMenu;
    boolean isInProcess;
    public ConsoleUI(){
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        mainMenu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("*Welcome message*");
        isInProcess = true;
        while(isInProcess){
            System.out.println(mainMenu.menu());
            String choiceStr = scanner.nextLine();
            if(checkChoice(choiceStr)){
                int choice = Integer.parseInt(choiceStr);
                mainMenu.execute(choice);
            }
        }
    }

    @Override
    public void printStr(String str) {
        System.out.println(str);
    }

    public void addFamilyMember(){
        System.out.print("Enter member's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter member's gender (M/F): ");
        Gender gender = getGenderBySymb(scanner.nextLine());


    }
    public Gender getGenderBySymb(String g){
        if( g.equals("M") ){
            return Gender.Male;
        } else if (g.equals("F")){
            return Gender.Female;
        }
        return null;
    }
    public int getMenuSize(){
        return mainMenu.size();
    }
    public String getMenu(){
        return mainMenu.menu();
    }
    public boolean checkChoice(String choiceStr){
        if(choiceStr.matches("[0-9]*")){
            int choice = Integer.parseInt(choiceStr);
            return choice >= 1 && choice <= mainMenu.size();
        }
        return false;
    }
    public void finish(){
        isInProcess = false;
    }
    public String getFamilyMemberList(){
        return presenter.getFamilyMemberList();
    }
    public void addTestMembers(){
        presenter.addTestMembers();
    }
    public void sortFamilyMemberListByName(){
        presenter.sortFamilyMemberListByName();
    }
    public void sortFamilyMemberListByAge() {
        presenter.sortFamilyMemberListByAge();
    }
    public void exportFamilyTree(){
        presenter.exportFamilyTree();
    }
    public void importFamilyTree(){
        presenter.importFamilyTree();
    }
}
