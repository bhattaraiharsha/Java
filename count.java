public class count {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int zero = 0;
        for (int i = 1; i <= 20; i++) {
            if (i == 0) {
                zero++;
            } else if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Zeros: " + zero);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}