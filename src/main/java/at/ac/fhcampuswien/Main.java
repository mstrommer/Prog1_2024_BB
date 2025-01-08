package at.ac.fhcampuswien;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import static at.ac.fhcampuswien.Generics.foo;

public class Main {
    public static void main(String[] args) {
        // Generics
        List<String> list = foo("Hello World");
        Predicate<String> p = new Predicate<>() {
            @Override
            public boolean test(String s) {
                return s.equals("Hello World");
            }
        };

        MyPredicate<String> mp = new MyPredicate<>();
        boolean result = foo(mp, "Hello");
        System.out.println("first approach: " + result);
        System.out.println("second approach: " + foo(p, "Hello World"));
        System.out.println("third approach: " + foo(s -> s.equals("Hello"), "Hello World"));

        Generics<Number> g = new Generics<>();
        g.printV(9);

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
