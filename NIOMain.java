package courses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOMain {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("somefile.txt");
        Path copyPath = Paths.get("copySomeFile.txt");
        Files.copy(path, copyPath, StandardCopyOption.REPLACE_EXISTING);

        String url = "https://ukr.net/news/sport.html";
        String protocol = url.substring(0, url.indexOf(":"));
        url = url.substring(url.indexOf(":") + 3);
        String host = url.substring(0, url.indexOf("/"));

        System.out.println(protocol);
        System.out.println(host);
    }
}
