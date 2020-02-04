package courses;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class SearchInFiles {
    public static void main(String[] args) {

        while (true) {
            String path = "C:\\Windows\\System32";
            File file = new File(path);
            File[] s = file.listFiles();

            show(s);

            System.out.println("//");
            Scanner scaner = new Scanner(System.in);
            String lol = scaner.nextLine();

            if (!lol.equals(".."))
                path = path + "\\" + lol;
            else
                path = file.getParent();
        }
    }

    static void show(File[] s) {

        for (int i = 0; i < s.length; i++) {
            if (s[i].isDirectory())
                System.out.println(s[i].getName());
        }

        for (int i = 0; i < s.length; i++) {
            if (s[i].isFile())
                System.out.println(s[i].getName());
        }
    }
}
