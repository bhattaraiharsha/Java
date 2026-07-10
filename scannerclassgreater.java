import java.io.*;

public class scannerclassgreater {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter first value");
        String s1 = br.readLine();
        System.out.println("enter second value");
        String s2 = br.readLine();
        System.out.println("enter third value");
        String s3 = br.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        if (a > b && a>c) {
            System.out.println("a is greater");
        } else if  (b>a && b>c) {
            System.out.println("b is greater");
        } else  if (c>a && c>b){
            System.out.println("c is greater");
         } else {
               System.out.println("all are equal");}
        }
    }
