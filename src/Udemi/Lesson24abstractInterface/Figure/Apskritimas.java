package Udemi.Lesson24abstractInterface.Figure;

class Apskritimas extends Figura2D {
    int kratiniuKiekis = 0;
    int radius = 3;
    @Override
    void perimetras() {
        System.out.println("Apskritimo perimetras = " + 2*3.14*radius);
    }

    @Override
    void plotas() {
        System.out.println("Apskritimo plotas = "+ 3.14*radius*radius);
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
