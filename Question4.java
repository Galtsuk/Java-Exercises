import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "Chad Gepetti";
        String password = "1482";

        System.out.print("Please enter your username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Please enter your password: ");
        String loginPassword = scanner.nextLine();

        if (loginUsername.equals(username) && loginPassword.equals(password)) {
            System.out.println("Logged in!");
        } else {
            System.out.println("Username or password is wrong!");
        }
    }
}
