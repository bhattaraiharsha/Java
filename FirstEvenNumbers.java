import java.util.Scanner;

public class FirstEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many even numbers you want to print: ");
        int n = scanner.nextInt();
        System.out.println("The first " + n + " even numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print((2 * i) + " ");
        }
    }
}