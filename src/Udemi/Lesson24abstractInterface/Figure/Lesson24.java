package Udemi.Lesson24abstractInterface.Figure;

public class Lesson24 {

    public static void main(String[] args) {
        Figura2D k1 = new Kvadratas();
        System.out.println(k1.krastiniuKiekis);
        k1.plotas();
        System.out.println();

        Figura2D a1 = new Apskritimas();
        System.out.println(a1.krastiniuKiekis);
        a1.plotas();
        System.out.println();

        Figura2D s1 = new Staciakampis();
        s1.plotas();
        s1.perimetras();
    }

}
