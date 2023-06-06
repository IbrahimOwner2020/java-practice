package Exercises.ReturnPositive;
import java.util.Scanner;

public class ReturnPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println(number);
        } else {
            System.out.println(-number);
        }
        scanner.close();
    }
}
