package SkillBox.FileNet;

import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

public class Filess {
    static void files1() {
        StringBuilder builder = new StringBuilder();

        try {
            List<String> lines = Files.readAllLines(Paths.get("data/aprasas.txt"));
            lines.forEach(line -> builder.append(line + "\n"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(builder.toString());
    }
}