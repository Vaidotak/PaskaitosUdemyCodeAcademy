package Udemi.Lesson24abstractInterface.Figure;

public interface Figura2 {
    // Konstanta:
    //int NUMBER=5;

    String get();
    // Default metodas:
    default void show(){
        System.out.println("Rezultatas: "+get());
    }
}
