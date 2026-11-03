import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int num = scanner.nextInt();

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < num; i++) {
            System.out.print(num1);

            if (i < num - 1) {
                System.out.print(", ");
            }

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
