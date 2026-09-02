public class newnew{
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
       try {
        System.out.println(100/0);
       }catch(ArithmeticException e){
    System.out.println("cannot divide by zero: " + e.getMessage());
       }
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
    }
}