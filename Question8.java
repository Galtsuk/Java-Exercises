public class Question8 {
    public static void main(String[] args) {
        System.out.print("*\t|\t");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();
        System.out.println("-----------------------------------------------");

        for (int row = 1; row <= 10; row++) {
            System.out.print(row + "\t|\t");

            for (int column = 1; column <= 10; column++) {
                int product = row * column;
                System.out.print(product + "\t");
            }

            System.out.println();
        }
    }
}
