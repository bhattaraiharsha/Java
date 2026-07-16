import java.util.Scanner;

public class natural {
    enum Level {
      Sunday,
      Monday,
      Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a Number:");
         switch(sc.nextInt()){
            case 1:
                System.out.println(Level.Sunday);
                break;
            case 2:
                System.out.println(Level.Monday);
                break;
            case 3:
                System.out.println(Level.Tuesday);
                break;
            case 4:
                System.out.println(Level.Wednesday);
                
                break;
            case 5:
                System.out.println(Level.Thursday);
                break;
            case 6:
                System.out.println(Level.Friday);
                break;
            case 7:
                System.out.println(Level.Saturday);
                break;
            default:
                System.out.println("Invalid Input");
         }
         sc.close();
    }
}
