package courses;

import java.io.*;

public class CloneDogMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Dog dog = new Dog("Alex",3,"buf");

       /* ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dog);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Dog cloneDog = (Dog) ois.readObject();*/

        System.out.println(dog);
    }
}
