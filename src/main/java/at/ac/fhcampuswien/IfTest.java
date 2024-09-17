package at.ac.fhcampuswien;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2;
        double result = 0;
        char operator;
        boolean error = false;
        System.out.print("n1: ");
        number1 = scan.nextInt();
        System.out.print("n2: ");
        number2 = scan.nextInt();
        System.out.print("op (-,+,*,/): ");
        operator = scan.next().charAt(0); // char einlesen
        System.out.println(operator);
        if(operator == '-'){
            result = number1 - number2;
        } else if(operator == '+'){
            result = number1 + number2;
        } else if(operator == '*'){
            result = number1 * number2;
        } else if(operator == '/'){
            if(number2 != 0){
                result = (double)number1 / number2; // double / int => double
            } else {
                error = true;
                System.out.println("Divsion by zero");
            }
        } else {
            error = true;
            System.out.println("invalid operator!");
        }
        if(!error) {
            System.out.println(result);
        }
    }
}
