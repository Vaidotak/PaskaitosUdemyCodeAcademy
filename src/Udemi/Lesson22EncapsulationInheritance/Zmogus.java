package Udemi.Lesson22EncapsulationInheritance;

public class Zmogus {
    final String lytis;

    public Zmogus(String lytis) {
        this.lytis = lytis;
    }
    private String name;
    private int amzius;
    private int svoris;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int i) {
        this.amzius = amzius;
        if(i>0){
            amzius = i;
        }
    }

    public int getSvoris() {
        return svoris;
    }

    public void setSvoris(int i) {
        this.svoris = svoris;
        if(i>0){
            svoris = i;
        }
    }
}
class Test{
    public static void main(String[] args) {
        Zmogus z = new Zmogus("vyras");
        z.setName("Marius");
        z.setAmzius(30);
        z.setSvoris(60);
        System.out.println(z.getName());
        System.out.println(z.getAmzius());
        System.out.println(z.getSvoris());
    }
}