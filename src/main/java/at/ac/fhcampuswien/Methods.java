package at.ac.fhcampuswien;

public class Methods {
    public static void main(String[] args) {
        System.out.println("=== Exercise 1 ===");
        int number = 10;
        printUntilNumber(number);

        System.out.println("=== Exercise 2 ===");
        int sum = sumOfNumbers(3,1000);
        System.out.println(sum);
    }

    // Exercise 1 aus den Folien
    public static void printUntilNumber(int number){
        for(int count = 1; count <= number; count++){
            System.out.println(count);
        }
    }

    // Exercise 2 aus den Folien
    public static int sumOfNumbers(int start, int end){
        int sum = 0;
        // Loop
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
