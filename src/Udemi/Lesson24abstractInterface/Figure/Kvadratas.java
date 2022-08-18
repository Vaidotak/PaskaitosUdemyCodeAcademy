package Udemi.Lesson24abstractInterface.Figure;

class Kvadratas extends Figura2D {
    int krastine = 10;
    int krastiniuKiekis = 4;
    @Override
    void perimetras() {
        System.out.println("Kvadrato perimetras = " + 4*krastine);
    }

    @Override
    void plotas() {
        System.out.println("Kvadrato plotis = "+ krastine*krastine);
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
