public class sort {
    public static void main(String[] args) {
        int a = 80;
        int b = 10;
        int c = 30;
        int[] numbers = {a, b, c};
        java.util.Arrays.sort(numbers);
        System.out.println(numbers[2]);
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);
    }
}