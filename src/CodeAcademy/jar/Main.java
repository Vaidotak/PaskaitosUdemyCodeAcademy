package CodeAcademy.jar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length == 3){
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int number3 = Integer.parseInt(args[2]);
            int result = SumService.getSumOf(number1, number2, number3);
            System.out.println("Suma: " + result);
        }else{
            System.out.print("Įvesk savo vardą: ");
            Scanner sc = new Scanner(System.in);
            String vardas = sc.next();
            System.out.println("Labas " + vardas);
        }
    }
}
