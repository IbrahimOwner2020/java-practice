package Exercises.TwoNumbers;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        if (a >= 0 && b >=0) {
            System.out.print(a + "-" + b);
        } else {
            System.out.print("Invalid numbers");
        }
        scanner.close();
    }
}
