package at.ac.fhcampuswien;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true) { // endless loop
            System.out.println("Type in a number, enter -1 to exit:");
            int number = scan.nextInt();
            if(number == -1) {
                break;
            } else {
                sum = sum + number;
            }
        }
        System.out.println("sum is " + sum);

        int count = 0;
        while (count < 5) {
            System.out.println("*");
            //count = count + 1;
            //count += 1;
            count++;
            System.out.println(count);
        }
        System.out.println("done!");

        count = 0;
        while (count < 5) {
            System.out.println("*");
            count = count + 5;
        }
        System.out.println("done");

        int i = 0;
        while (i != 50) {
            System.out.println(i);
            i = i + 2;
        }
        System.out.println("done");
    }
}
