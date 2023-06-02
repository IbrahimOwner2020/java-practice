import java.util.Scanner;

public class UserInfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter your date of birth: ");
        String dob = scanner.nextLine();

        System.out.println("\nUser Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("DOB: " + dob);

        scanner.close();
    }
}
