package model.familyTree;

import model.Humans.FamilyMemberComparable;

import java.util.Comparator;

public class FamilyMemberComparatorByName<T extends FamilyMemberComparable<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
