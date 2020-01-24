package courses;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(10);
        list.add(90);
        //сумма нечётных
        Integer number = list.stream().filter(e -> e %2 != 0).reduce((e1, e2) -> e1 + e2).orElse(0);

        //List<Integer> l2 = list.stream().filter(e -> e %2 != 0).collect();
    }
}
