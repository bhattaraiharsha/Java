import java.io.*;

public class guess {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Guess a number up to 10:");
        String s1 = br.readLine();
        int userGuess = Integer.parseInt(s1);
        int secretNumber = (int) (Math.random() * 11);
        if (userGuess == secretNumber) {
            System.out.println("Correct!");
        } else {
            System.out.println("Try again!");
        }
    }
}