import java.io.*;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter value " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);
        System.out.println("Sorted values:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}