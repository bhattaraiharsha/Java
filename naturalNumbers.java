import java.util.Scanner;

public class naturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter how many even numbers you want to sum: ");
        int n = scanner.nextInt();
        
        System.out.println("The sum of " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            
            sum+=i;
            System.out.print("sum=" +sum);
        }
    }
}