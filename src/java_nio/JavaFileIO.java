package java_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaFileIO {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("/home/castilho/Developer/projects/java-learning/java-nio.txt");

            byte[] fileBytes = Files.readAllBytes(path);

            System.out.println(fileBytes);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
