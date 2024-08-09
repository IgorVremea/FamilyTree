package model.service;

import model.Humans.FamilyMember;
import model.Humans.Gender;
import model.familyTree.FamilyTree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private long id;
    FamilyTree familyTree;


    public Service(){
        id = 0;
        familyTree = new FamilyTree();
    }
    public void addFamilyMember(FamilyMember member){
        familyTree.addFamilyMember(member);
    }

    public void addTestMembers(){
        FamilyMember mama1 = new FamilyMember("Mama N1", Gender.Female, LocalDate.of(1977, 6, 27));
        FamilyMember papa1 = new FamilyMember("Papa N1", Gender.Male, LocalDate.of(1977, 6, 25));
        FamilyMember child1 = new FamilyMember("Child N1", Gender.Male, LocalDate.of(2000, 6, 9), mama1, papa1);
        FamilyMember child2 = new FamilyMember("Child N2", Gender.Female, LocalDate.of(2001, 6, 10), mama1, papa1);
        FamilyMember child3 = new FamilyMember("Child N3", Gender.Male, LocalDate.of(2002, 6, 11), mama1, papa1);
        List<FamilyMember> children = new ArrayList<>();
        papa1.setChildren(children);
        mama1.setChildren(children);
        children.add(child1);
        children.add(child2);
        children.add(child3);
        addFamilyMember(mama1);
        addFamilyMember(papa1);
    }
    public void showTreeMembers(){
        System.out.println(familyTree);
    }
}
