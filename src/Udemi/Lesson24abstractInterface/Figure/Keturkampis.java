package Udemi.Lesson24abstractInterface.Figure;

abstract class Keturkampis extends Figura2D { //jeigu vaikinė klasė abstract,
    // tada tėvinės klasės metodų gali neperrašyti
    void def(){
        System.out.println("Čia keturkampis");
    }
}
