package courses;

import java.io.*;

public class Dog extends Animal implements  Externalizable {
    private Owner owner;
    private String dogField;

    public Dog() {
        super("Los", 4);
    }

    public Dog(String name, int age, String dogField) {
        super(name, age);
        this.dogField = dogField;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "owner=" + owner +
                ", dogField='" + dogField + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
        out.writeObject(dogField);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            name = in.readObject().toString();
            age = in.readInt();
            dogField = in.readObject().toString();
    }
}

