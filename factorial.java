import java.io.*;

public class factorial {
public static void main(String[] args) throws IOException {
    int i;
    long fact =1;
InputStreamReader isr =new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("enter n: ");
String s1 = br.readLine();
 int n = Integer.parseInt(s1);
 for(i=1;i<= n ;i++)
    fact=fact*i;
  System.out.println("Factorial ="+n+  fact);
}   
}