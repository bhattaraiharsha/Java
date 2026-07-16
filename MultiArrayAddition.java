import java.util.Scanner;

public class MultiArrayAddition {
    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the arrays: ");
        int size = newscanner.nextInt();
        
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] sumArray = new int[size];
        
        System.out.println("--- Enter values for First Array ---");
        for (int i = 0; i < size; i++) {
            System.out.print("Array 1 - Element " + (i + 1) + ": ");
            array1[i] = newscanner.nextInt();
        }
        
        System.out.println("--- Enter values for Second Array ---");
        for (int i = 0; i < size; i++) {
            System.out.print("Array 2 - Element " + (i + 1) + ": ");
            array2[i] = newscanner.nextInt();
        }
        
        System.out.println("--- Resulting Sum Array ---");
        for (int i = 0; i < size; i++) {
            sumArray[i] = array1[i] + array2[i];
            System.out.println("Position " + i + ": " + array1[i] + " + " + array2[i] + " = " + sumArray[i]);
        }
        
   }
}