package Udemi.Lesson24abstract;

abstract class Figura { // jeigu klasėje yra abstraktūs metodai, tai ir pati klasė turi būti abstract.
    // Abstract klasėje gali ir nebūti abstract metodų

    // Abstract klasė negali būti final, (metodų private, static irgi nebūna) kintamieji negali būti abstract
    // Abstract gali būti konstruktorius


    int krastiniuKiekis = 0;

    abstract void perimetras(); //pas abstarct metodus nebūna kūno
    abstract void plotas();

    void showInfo(){
        System.out.println("Parodyk informacija");
    }



}