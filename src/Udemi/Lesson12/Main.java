package Udemi.Lesson12;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(1, 4);
        Car c2 = new Car(2, 5);

        Student s1 = new Student(2);

        switch (s1.grade) {
            case 2:
                System.out.println("Studentas dvejetukininkas");
                break;
            case 3:
                System.out.println("Studentas trejetukininkas");
                break;
            case 4:
                System.out.println("Studentas ketvirtukininkas");
                break;
            case 5:
                System.out.println("Studentas pirmūnas");
                break;
            default:
                System.out.println("Nėra tokio studento");
        }


    }
}