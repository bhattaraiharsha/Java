import java.io.*;
public class ScannerSort {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter first value:");
        String s1 = br.readLine();
        System.out.println("Enter second value:");
        String s2 = br.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("\nSorted values in ascending order:");
        System.out.println(a);
        System.out.println(b);
    }
}