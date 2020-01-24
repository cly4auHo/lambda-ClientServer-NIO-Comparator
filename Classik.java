package courses;

public class Classik {
    static int c = 0;
    static int a = 3;
    static int b = 4;

    public static void main(String[] args) {
        Lim l = new Lim();
        l.lol(a, b, (a, b) -> System.out.println(a + b));
    }
}

class Lim {
    void lol(int a, int b, Summa s) {
        s.sum(a, b);
    }
}
