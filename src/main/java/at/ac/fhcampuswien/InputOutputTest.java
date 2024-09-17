package at.ac.fhcampuswien;

import java.util.Scanner;

public class InputOutputTest {
    public static void main(String[] args) {
        // Aufgabefunktion printf
        System.out.printf("%S\n", "Hello World!");
        int x = 6;
        int y = 10;
        System.out.printf("x = %5d\ny = %5d\n", x, y);
        System.out.println("x = " + x + ", y = " + y);
        System.out.printf("%.12f\n", 3.35565469456);

        // Define the scanner
        Scanner scan = new Scanner(System.in);

        // Think about variables where to store things
        String something = "double";
        double radius;
        double area;
        double circumference;
        final double PI;
        PI = 3.14159;
        // Math.PI alternative
        // 2 * radius * Math.PI -> Java API

        System.out.print("Bitte gib einen Radius an: ");

        radius = scan.nextDouble(); // -> Java API

        // Think about your algorithm
        // Input / Output?
        // Some operation
        area = radius * radius * PI;
        circumference = 2 * radius * PI;

        System.out.println("Fläche: " + area);
        System.out.println("Umfang: " + circumference);
        System.out.printf("Fläche: %.2f\n", area);
    }
}