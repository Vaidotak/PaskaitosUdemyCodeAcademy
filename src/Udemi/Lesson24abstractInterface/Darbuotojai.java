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
class Mokytojas extends Darbuotojai implements HelpAble{ //implements turi override metodus
    int mokiniuKiekis;
    void moko(){
        System.out.println("Moko");
    }

    @Override
    public void pagalba() {
        System.out.println("Mokytojas pagelbsti");
    }
    @Override
    public void gesintiGaisra(){
        System.out.println("Mokytojas gesina gaisrą");
    }
}

class Vairuotojas extends Darbuotojai implements HelpAble,MokaPlaukti{
    String masinosPavadinimas;
    void vairuoja(){
        System.out.println("Vairuoja");
    }

    @Override
    public void pagalba() {
        System.out.println("Vairuotojas pagelbėja");

    }

    @Override
    public void gesintiGaisra() {
        System.out.println("Vairuotojas gesina gaisrą");
    }

    @Override
    public void plaukti() {
        System.out.println("Vairuotojas plaukia");
    }
}
interface HelpAble{
    void pagalba(); // interface gali palaikyti tik abstract metodus (be kuno)
    void gesintiGaisra();
}
interface MokaPlaukti{
    void plaukti();
    int a = 10; //kintamieji gali būti tik konstantos

}