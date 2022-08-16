package Udemi.Lesson24abstract;

public class Staciakampis extends Figura{
    int krastine = 8;
    int krastine2 = 4;
    @Override
    void perimetras() {
        System.out.println("Stačiakampio perimetras = " + 2*(krastine+krastine2));
    }

    @Override
    void plotas() {
        System.out.println("Stačiakampio plotas = "+ krastine*krastine2);
    }




}
