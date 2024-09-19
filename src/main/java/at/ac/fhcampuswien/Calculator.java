package at.ac.fhcampuswien;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // +, -, *, /, %
        // Variablen deklarieren
        double number1, number2, result = 0;
        System.out.print("n1: ");
        number1 = scan.nextDouble();
        System.out.print("op (+,-,*,/): ");
        char operator = scan.next().charAt(0);
        System.out.print("n2: ");
        number2 = scan.nextDouble();
        // Berechnung durchführen
        switch(operator){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("invalid input.");
        }
        // Ergebnisausgabe
        System.out.println("r: " + result);
    }
}
