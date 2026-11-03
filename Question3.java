import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("You are a Kid!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager!");
        } else if (age >= 20 && age <= 64) {
            System.out.println("You are an Adult!");
        } else if (age >= 65) {
            System.out.println("You are old!");
        } else {
            System.out.println("Age is not valid!");
        }
    }
}
