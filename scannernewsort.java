import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class scannernewsort {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
        
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
