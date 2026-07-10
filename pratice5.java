
  public class pratice5 {
 public static void main(String[] args) {
        int[]marks=new int[3];
        marks[0]=100;
        marks[1]=90;
        marks[2]=80;
        System.out.println( marks[1] );
        System.out.println( marks[2] );
        System.out.println( marks[0] ); 
            java.util.Arrays.sort(marks);
            System.out.println("Total ="+( marks[0] +  marks[1] +  marks[2] ));
    }
}
