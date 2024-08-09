package model.familyTree;

import model.Humans.FamilyMemberComparable;

import java.util.Comparator;

public class FamilyMemberComparatorByAge<T extends FamilyMemberComparable<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
