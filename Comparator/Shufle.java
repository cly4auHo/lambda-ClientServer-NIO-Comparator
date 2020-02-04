package courses;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Shufle {

    public static void main(String[] args) {
        //BoozerComparator bc = new BoozerComparator();
        BoozerComparator bc = new BoozerComparator() {
            @Override
            public int compare(Boozer o1, Boozer o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1; //vozrastanie
            }
        };

        //Set<Boozer> set = new TreeSet<Boozer>(bc);
        Set<Boozer> set = new TreeSet<Boozer>((o1, o2) -> o1.getAge() > o2.getAge() ? 1 : -1);

        Boozer d = new Boozer("Shval", 3);
        Boozer d2 = new Boozer("Shval", 0);
        Boozer d3 = new Boozer("Shval", 4);

        set.add(d);
        set.add(d2);
        set.add(d3);

        System.out.println(set);
    }
}
