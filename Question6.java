import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer");
        int number = scanner.nextInt();

        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Blastoff!");
    }
}
