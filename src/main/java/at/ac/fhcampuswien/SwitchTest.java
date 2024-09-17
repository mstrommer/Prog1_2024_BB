package at.ac.fhcampuswien;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("d: ");
        String day = scan.next(); // "Monday", "Tuesday"...
        int internalDay;
        switch(day){
            case "Monday":
                internalDay = 1;
                break;
            case "Tuesday":
                internalDay = 2;
                break;
            case "Wednesday":
                internalDay = 3;
                break;
            default:
                internalDay = -1;
                System.out.println("Invalid day!");
        }
        System.out.println("Internal value: " + internalDay);

        System.out.print("Gib eine Zahl ein: ");
        String input = scan.next();
        int number = Integer.parseInt(input); // API
        System.out.println(number + 1);
    }
}
