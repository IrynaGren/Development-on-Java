package lab4;

import java.util.Comparator;

public class PurposeComparator implements Comparator<Equipment> {

    public int compare(Equipment s1, Equipment s2) {
        return s1.getSport().compareTo(s2.getSport());
    }
}