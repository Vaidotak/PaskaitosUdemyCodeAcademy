package Udemi.Lesson24abstractInterface;

public class Darbuotojai {
    double salary = 100;
    String name = "Romas";
    int age;
    int experience;
    void eat(){
        System.out.println("Valgo");
    }
    void sleep(){
        System.out.println("Miega");
    }


}
class Mokytojas extends Darbuotojai{
    int mokiniuKiekis;
    void moko(){
        System.out.println("Moko");
    }
}

class Vairuotojas extends Darbuotojai{
    String masinosPavadinimas;
    void vairuoja(){
        System.out.println("Vairuoja");
    }

}
