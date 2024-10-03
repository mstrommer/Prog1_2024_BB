package at.ac.fhcampuswien;

public class Loops {
    public static void main(String[] args) {
        printStair();
        int number = 0;
        while(number != 4 && number != 1){
            number++;
        }
    }

    public static int sumOfDigits(int number){
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    private static void printStair() {
        for (int i = 0; i < 5; i++) { // outer Loop
            for (int j = 0; j <= i; j++) { // inner Loop 1 Reihe
                System.out.print("* "); // 25
            }
            System.out.println();
        }
    }
}
