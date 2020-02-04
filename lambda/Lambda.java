package courses;

public class Lambda {
    public static void main(String[] args) {

        MyInt my = new MyInt() {
            @Override
            public void someMethod() {
                System.out.println("Lol");
            }
        };

        SomeClass some = new SomeClass();
        some.method(my);
        some.method(()-> System.out.println("LOL"));
    }
}
