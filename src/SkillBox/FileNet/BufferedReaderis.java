package SkillBox.FileNet;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderis {
    static void br() {
        StringBuilder builder = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader("data/aprasas.txt"));
            for (; ; ) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                builder.append(line + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(builder.toString());
    }
}
