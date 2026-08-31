import java.io.*;

public class Game {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter difficulty level from 1 to 5:");
        String inputStr = reader.readLine();
        int i = Integer.parseInt(inputStr);
        if (i == 1) {
            System.out.println("\nDifficulty level = Very Easy");
            System.out.println("Press Enter to continue...");
            reader.readLine();
            System.out.println("Solve the problem:");
            System.out.println("Find x when: 2x + 3x = 5");
            System.out.println("Are you ready? You have 10 seconds (type 'yes' or anything else):");
            String ready = reader.readLine();
            if (ready.equalsIgnoreCase("yes")) {
                System.out.println("Great! Enter your answer for x:");
            } else {
                System.out.println("Take your time, when ready let's continue.");
                System.out.println("Enter your answer for x:");
            }
            int x = Integer.parseInt(reader.readLine());
            if (x == 1) {
                System.out.println("That was easy! Try other levels.");
            } else {
                System.out.println("🤣 LoL");
            }
        } 
        else if (i == 2) {
            System.out.println("\nDifficulty level = Easy");
            System.out.println("Press Enter to continue...");
            reader.readLine();
            
            System.out.println("Solve the problem:");
            System.out.println("Find x when: 5x * 7x = 140");
            System.out.println("Enter your answer for x:");
            
            int x = Integer.parseInt(reader.readLine());
            if (x == 2) {
                System.out.println("Nice 👍");
            } else {
                System.out.println("Yesto pani saklina!");
            }
        } 
        else if (i == 3) {
            System.out.println("\nDifficulty level = Medium");
            System.out.println("Press Enter to continue...");
            reader.readLine();
            
            System.out.println("Solve the problem:");
            System.out.println("Find x when: x + x = 4");
            System.out.println("Enter your answer for x:");
            
            int x = Integer.parseInt(reader.readLine());
            if (x == 2) {
                System.out.println("Great!");
            } else {
                System.out.println("Tera kya hoga 😆");
            }
        } 
        else if (i == 4) {
            System.out.println("Difficulty level = Hard");
            System.out.println("Press Enter to continue...");
            reader.readLine();
            
            System.out.println("Solve the question:");
            System.out.println("If a car is going 50 km/h, how much time does it take to reach a destination 150 km far?");
            System.out.println("Enter hours:");
            
            int hours = Integer.parseInt(reader.readLine());
            if (hours == 3) {
                System.out.println("Wow 😳");
            } else {
                System.out.println("🤣");
            }
        } 
        else if (i == 5) {
            System.out.println("\nDifficulty level = Bihar");
            System.out.println("Press Enter to continue...");
            reader.readLine();
            
            System.out.println("One question for you:");
            System.out.println("Who came first: egg or chicken?");
            System.out.println("If egg type 1, else type 2:");
            
            int choice = Integer.parseInt(reader.readLine());
            System.out.println("Trick question! Dinosaur came first 🦖");
        } 
        else {
            System.out.println("Invalid level! Please choose between 1 and 5.");
        }
    }
}