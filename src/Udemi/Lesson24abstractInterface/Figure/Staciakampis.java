package Udemi.Lesson24abstractInterface.Figure;

public class Staciakampis extends Figura2D {
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


    @Override
    public double getVisibleHeight() {
        return 0;
    }

    @Override
    public double getVisibleWeight() {
        return 0;
    }
}
