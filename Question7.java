import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int sum = 0;

        while (number != 0) {
            System.out.print("Enter a number (0 to finish): ");
            number = scanner.nextInt();
            sum = sum + number;
        }

        System.out.println("The total sum is: " + sum);
    }
}
