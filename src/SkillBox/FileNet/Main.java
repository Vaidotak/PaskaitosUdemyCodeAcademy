package SkillBox.FileNet;
import java.io.File;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/Vaidotas/Desktop/aprasas.txt");
        File file2 = new File("data/aprasas.txt");
        File fileDirectory = new File("/Users/Vaidotas/Desktop/java");
        fileDirectory.mkdir(); //komanda sukuria papkę, kuria prieš tai prisirašau pathname.
        // Šiuo atveju /katalogas
        File[] filesInDirectory = fileDirectory.listFiles();

        for (File byla : filesInDirectory){
            System.out.println(byla.getAbsoluteFile()); // parodo katalogo turinį
        }

        System.out.println(file.length());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
        System.out.println(fileDirectory.isDirectory());

        FileInputStreamas.is(); // raidynas su kringeliais
        BufferedReaderis.br(); // teisingas raidynas
        Filess.files1(); // teisingas raidynas


    }
}
