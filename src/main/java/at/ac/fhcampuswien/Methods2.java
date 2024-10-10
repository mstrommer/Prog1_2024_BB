package at.ac.fhcampuswien;

import java.util.Scanner;

public class Methods2 {

    public static int sumOfNumbers(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
            // sum += i;
        }
        return sum;
    }

    public static void printUntilNumber(int number){
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte gib zwei Zahlen: ");
        int sum = sumOfNumbers(sc.nextInt(), sc.nextInt());
        System.out.println(sum);

        System.out.println("Gib eine Zahl ein: ");
        printUntilNumber(sc.nextInt());
        sc.close();
    }
}
