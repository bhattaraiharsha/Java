import java.io.*;

public class scannerclass  {
public static void main(String[] args) throws IOException {
InputStreamReader isr =new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("enter first value");
String s1 = br.readLine();
 System.out.println("enter second value");
 String s2 = br.readLine();
 int a = Integer.parseInt(s1);
 int b = Integer.parseInt(s2);
 System.out.println("Addition = "+(a+b));
 
}   
}