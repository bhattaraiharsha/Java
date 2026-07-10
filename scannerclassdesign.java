import java.io.*;
public class scannerclassdesign  {
public static void main(String[] args) throws IOException {
InputStreamReader isr =new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("enter largest value");
String s1 = br.readLine();
 int n = Integer.parseInt(s1);
 for (int i =1; i<=n;i++ )
        {
        for(int j=n;j>=i;j--)
    {
System.out.print("#");
    }
System.out.println("   ");
}
}
}   
