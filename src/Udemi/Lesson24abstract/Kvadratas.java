package Udemi.Lesson24abstract;

class Kvadratas extends Figura{
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
}
