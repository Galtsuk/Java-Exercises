import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Price: ");
        int price = scanner.nextInt();

        System.out.print("Are you a GA team member? ");
        String member = scanner.next();

        double discount = 0;

        if (member.equalsIgnoreCase("yes")) {
            if (price > 300) {
                discount = price * 0.15;
            } else {
                discount = price * 0.05;
            }
        } else if (member.equalsIgnoreCase("no") && price > 300) {
            discount = price * 0.07;
        }

        System.out.println("Discount amount: " + discount);
        System.out.println("Price to pay: " + (price - discount));
    }
}
