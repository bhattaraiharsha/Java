import java.io.*;

public class Game {
    // Console Colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BOLD = "\u001B[1m";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(CYAN + BOLD + "========================================");
        System.out.println("       WELCOME TO THE MATH TRIVIA!      ");
        System.out.println("========================================" + RESET);
        
        System.out.println(YELLOW + "\nChoose your challenge level (1 to 5):" + RESET);
        System.out.println(BLUE + "1. Very Easy" + RESET);
        System.out.println(GREEN + "2. Easy" + RESET);
        System.out.println(PURPLE + "3. Medium" + RESET);
        System.out.println(RED + "4. Hard" + RESET);
        System.out.println(CYAN + "5. Bihar (Legendary)" + RESET);
        
        System.out.print(BOLD + "\nEnter your choice: " + RESET);
        int i = Integer.parseInt(reader.readLine());

        if (i == 1) {
            printHeader("Difficulty Level: Very Easy");
            printPressEnter(reader);
            
            System.out.println(CYAN + "Solve the problem:" + RESET);
            System.out.println(BOLD + "Find x when: 2x + 3x = 5" + RESET);
            System.out.println(YELLOW + "Are you ready? You have 10 seconds (type 'yes'):" + RESET);
            
            String ready = reader.readLine();
            if (ready.equalsIgnoreCase("yes")) {
                System.out.println(GREEN + "Great! Enter your answer for x:" + RESET);
            } else {
                System.out.println(YELLOW + "Take your time! Enter your answer for x:" + RESET);
            }
            
            int x = Integer.parseInt(reader.readLine());
            if (x == 1) {
                System.out.println(GREEN + BOLD + "✨ That was easy! Try other levels. ✨" + RESET);
            } else {
                System.out.println(RED + "🤣 LoL, try again next time!" + RESET);
            }
        } 
        else if (i == 2) {
            printHeader("Difficulty Level: Easy");
            printPressEnter(reader);
            
            System.out.println(CYAN + "Solve the problem:" + RESET);
            System.out.println(BOLD + "Find x when: 5x * 7x = 140" + RESET);
            System.out.print(YELLOW + "Enter your answer for x: " + RESET);
            
            int x = Integer.parseInt(reader.readLine());
            if (x == 2) {
                System.out.println(GREEN + BOLD + "Nice 👍 Perfect answer!" + RESET);
            } else {
                System.out.println(RED + "Yesto pani saklina! 😅" + RESET);
            }
        } 
        else if (i == 3) {
            printHeader("Difficulty Level: Medium");
            printPressEnter(reader);
            
            System.out.println(CYAN + "Solve the problem:" + RESET);
            System.out.println(BOLD + "Find x when: x + x = 4" + RESET);
            System.out.print(YELLOW + "Enter your answer for x: " + RESET);
            
            int x = Integer.parseInt(reader.readLine());
            if (x == 2) {
                System.out.println(GREEN + BOLD + "Great! You nailed it." + RESET);
            } else {
                System.out.println(RED + "Tera kya hoga 😆" + RESET);
            }
        } 
        else if (i == 4) {
            printHeader("Difficulty Level: Hard");
            printPressEnter(reader);
            
            System.out.println(CYAN + "Solve the question:" + RESET);
            System.out.println(BOLD + "If a car is going 50 km/h, how much time does it take to reach a destination 150 km far?" + RESET);
            System.out.print(YELLOW + "Enter hours: " + RESET);
            
            int hours = Integer.parseInt(reader.readLine());
            if (hours == 3) {
                System.out.println(GREEN + BOLD + "Wow 😳 Genius move!" + RESET);
            } else {
                System.out.println(RED + "🤣 Math skills need an upgrade!" + RESET);
            }
        } 
        else if (i == 5) {
            printHeader("Difficulty Level: Bihar");
            printPressEnter(reader);
            
            System.out.println(CYAN + "One ultimate question for you:" + RESET);
            System.out.println(BOLD + "Who came first: egg or chicken?" + RESET);
            System.out.println("If egg type 1, else type 2:");
            System.out.print(YELLOW + "Your choice: " + RESET);
            
            Integer.parseInt(reader.readLine());
            System.out.println(PURPLE + BOLD + "\n🦖 Trick question! Dinosaurs came first! 🦖" + RESET);
        } 
        else {
            System.out.println(RED + "Invalid level! Please choose between 1 and 5 next time." + RESET);
        }
        
        System.out.println(CYAN + BOLD + "\n========================================");
        System.out.println("            THANKS FOR PLAYING!         ");
        System.out.println("========================================" + RESET);
    }

    public static void printHeader(String title) {
        System.out.println(PURPLE + "\n----------------------------------------");
        System.out.println(" " + title);
        System.out.println("----------------------------------------" + RESET);
    }

    public static void printPressEnter(BufferedReader reader) throws IOException {
        System.out.print(CYAN + "[Press Enter to reveal the problem...]" + RESET);
        reader.readLine();
        System.out.println();
    }
}