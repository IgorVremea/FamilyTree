package model.familyTree;

import model.Humans.FamilyMember;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
    private List<FamilyMember> tree;

    public FamilyTree(){
        this.tree = new ArrayList<>();
    }
    public FamilyTree(List<FamilyMember> tree){
        this.tree = tree;
    }
    public FamilyTree(FamilyMember member){
        this.tree = new ArrayList<>();
        this.tree.add(member);
    }

    public List<FamilyMember> findPerson(String name){
        List<FamilyMember> listResult = new ArrayList<>();
        for(FamilyMember person : tree){
            if(person.getName().equals(name)){
                listResult.add(person);
            }
        }
        return listResult;
    }
    public List<FamilyMember> findPerson(String name, int age){
        List<FamilyMember> listResult = new ArrayList<>();
        for(FamilyMember person : tree){
            if(person.getName().equals(name) && person.getAge() == age){
                listResult.add(person);
            }
        }
        return listResult;
    }
    public List<FamilyMember> findPerson(String name, int age, String fatherName, String motherName){
        List<FamilyMember> listResult = new ArrayList<>();
        for(FamilyMember person : tree){
            if(person.getName().equals(name)
                    && person.getAge() == age
                    && person.getFather().getName().equals(fatherName)
                    && person.getMother().getName().equals(motherName)){
                listResult.add(person);
            }
        }
        return listResult;
    }

    public void addFamilyMember(FamilyMember member){
        this.tree.add(member);
    }

    public List<FamilyMember> getTree() {
        return tree;
    }
    public FamilyMember getMemberFromList(int id){
        return tree.get(id);
    }

    public String showMemberFromList(int id){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id);
        stringBuilder.append(". ");
        stringBuilder.append(tree.get(id - 1));
        return stringBuilder.toString();
    }
    public void sortByName(){
        tree.sort(new FamilyMemberComparatorByName<>());
    }
    public void sortByAge(){
        tree.sort(new FamilyMemberComparatorByAge<>());
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Family members:\n");
        for(int i = 0; i < tree.size(); i++){

            stringBuilder.append(showMemberFromList(i+1));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
