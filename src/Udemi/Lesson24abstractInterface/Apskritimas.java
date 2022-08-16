package Udemi.Lesson24abstractInterface;

class Apskritimas extends Figura {
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






}
