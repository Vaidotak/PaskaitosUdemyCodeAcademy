package Udemi.Lesson24abstract;

public class Lesson24 {

    public static void main(String[] args) {
        Figura k1 = new Kvadratas();
        System.out.println(k1.krastiniuKiekis);
        k1.plotas();
        System.out.println();

        Figura a1 = new Apskritimas();
        System.out.println(a1.krastiniuKiekis);
        a1.plotas();
        System.out.println();

        Figura s1 = new Staciakampis();
        s1.plotas();
        s1.perimetras();
    }

}
