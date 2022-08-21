package SkillBox.FileNet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class FileInputStreamas {

    static void is(){

        StringBuilder builder = new StringBuilder();

        try {
        FileInputStream is = new FileInputStream("data/aprasas.txt");
        for(;;){
            int code = is.read();
            if(code < 0){
                break;
            }
            char ch = (char) code;
            builder.append(ch);
        }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println(builder.toString());
    }

}
