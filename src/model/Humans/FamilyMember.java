package model.Humans;

import model.familyTree.FamilyTree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FamilyMember extends Human implements FamilyMemberComparable<FamilyMember>, Serializable {

    private FamilyMember mother;
    private FamilyMember father;
    private List<FamilyMember> children;


    // Конструкторы
    public FamilyMember(String name, Gender gender, LocalDate birthDate) {
        super(name, gender, birthDate, null);
        this.mother = null;
        this.father = null;
        this.children = new ArrayList<>();
    }

    public FamilyMember(String name, Gender gender, LocalDate birthDate, LocalDate deathDate) {
        this(name, gender, birthDate);
        this.deathDate = deathDate;
    }

    public FamilyMember(String name, Gender gender, LocalDate birthDate, LocalDate deathDate, FamilyMember mother, FamilyMember father) {
        this(name, gender, birthDate, deathDate);
        this.mother = mother;
        this.father = father;
    }

    public FamilyMember(String name, Gender gender, LocalDate birthDate, LocalDate deathDate, FamilyMember mother, FamilyMember father, List<FamilyMember> children) {
        this(name, gender, birthDate, deathDate, mother, father);
        this.children = children;
    }
    // Те же конструкторы, но без даты смерти

    public FamilyMember(String name, Gender gender, LocalDate birthDate, FamilyMember mother, FamilyMember father) {
        this(name, gender, birthDate, null, mother, father);
    }

    public FamilyMember(String name, Gender gender, LocalDate birthDate, FamilyMember mother, FamilyMember father, List<FamilyMember> children) {
        this(name, gender, birthDate, null, mother, father, children);
    }

    public void setParents(FamilyMember father, FamilyMember mother){
        this.father = father;
        this.mother = mother;
    }

    public void setMother(FamilyMember mother){
        setParents(this.father, mother);
    }

    public void setFather(FamilyMember father){
        setParents(father, this.mother);
    }

    public void setChildren(List<FamilyMember> children) {
        this.children = children;
    }
    public void addChildren(FamilyMember child){
        this.children.add(child);
    }

    public FamilyMember getMother() {
        return mother;
    }

    public FamilyMember getFather() {
        return father;
    }

    public List<FamilyMember> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(name);
        stringBuilder.append("; Gender: ");
        stringBuilder.append(gender);
        stringBuilder.append("; Age: ");
        stringBuilder.append(getAge());
        if(mother != null) {
            stringBuilder.append("; Mother's name: ");
            stringBuilder.append(mother.getName());
        }
        if(father != null) {
            stringBuilder.append("; Father's name: ");
            stringBuilder.append(father.getName());
        }
        if(children.size() != 0) {
            stringBuilder.append("; Children's names: ");
            boolean isFirst = true;
            for(FamilyMember member : children){
                if(isFirst) {
                    isFirst = false;
                } else {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(member.getName());
            }
        }
        stringBuilder.append(";");
        return stringBuilder.toString();
    }

    @Override
    public int compareTo(FamilyMember o) {
        return this.getName().compareTo(o.getName());
    }
}
