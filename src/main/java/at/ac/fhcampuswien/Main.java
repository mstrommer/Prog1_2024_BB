package at.ac.fhcampuswien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // What are our variables?
        double area = 0.;
        double perimeter = 0.;
        final double PI = 3.1415;
        double radius = 0.;

        // printf
        System.out.printf("%f\n", PI);
        System.out.println(PI);
        // double area, perimeter, radius;
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gib den Radius ein: ");
        radius = sc.nextDouble();
        // Calculations
        area = radius * radius * PI;
        // Math.PI alternative for PI
        perimeter = 2 * radius * PI;
        // Output
        System.out.println("---- ungerundet ----");
        System.out.println("Fläche: " + area);
        System.out.println("Umfang: " + perimeter);
        System.out.println("---- gerundet ----");
        System.out.printf("Fläche: %.2f\n", area);
        System.out.printf("Umfang: %.2f\n", perimeter);

    }
}
