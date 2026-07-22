import java.io.BufferedReader;
import java.io.InputStreamReader;

public class newsort {
    public static void main(String[] args) {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[15];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Enter value " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }   
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
