package at.ac.fhcampuswien;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] reversedNumbers = reverseNumber(numbers);
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(java.util.Arrays.toString(reversedNumbers));
        System.out.println(numbers);
        System.out.println(reversedNumbers);
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("length: ");
        int[] numbers = getNumbersFromUser(sc.nextInt());
        for (int number : numbers) {
            System.out.println(number);
        }

        /*
        String [] myText = new String[10];
        System.out.println(myText[0]);
        createStrings(myText);
        System.out.println(myText[0]);


         */
    }

    public static int[] getNumbersFromUser(int length){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print(": ");
            numbers[i] = sc.nextInt();
        }
        sc.close();
        return numbers;
    }

    public static void createStrings(String[] text){
         text[0] = "Hello World!";
    }

    public static int[] reverseNumber(int[] numbers){
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[numbers.length - i - 1] = numbers[i];
        }
        return reversedNumbers;
    }
}
