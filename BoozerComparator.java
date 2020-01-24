package courses;

import java.util.Comparator;

public class BoozerComparator implements Comparator<Boozer> {
    @Override
    public int compare(Boozer o1, Boozer o2) {
        return o1.getAge() > o2.getAge() ? 1 : -1; //vozrastanie
    }
}
