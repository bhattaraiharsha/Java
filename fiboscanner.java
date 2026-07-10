import java.io.*;

public class fiboscanner {
    public static void main(String[] args) throws IOException {
        int firstTerm = 0;
        int secondTerm = 1;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the number of terms:");
        String s1 = br.readLine();
        int n = Integer.parseInt(s1);
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }   
}