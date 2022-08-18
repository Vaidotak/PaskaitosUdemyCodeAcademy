package CodeAcademy.Paskaita17exeptions;

import java.util.Random;

public class Lektuvas {
    public void isskleistiVaziuokle(){
        Random rand = new Random();

        int randomNum = rand.nextInt(11);
        System.out.println(100 / randomNum);
        System.out.println("OK, važiuoklė išskleista sėkmingai");
    }
}
