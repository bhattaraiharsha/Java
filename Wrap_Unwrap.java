
public class Wrap_Unwrap {
    public static void main(String[] args) {
        // wrapping int to Integer
        int a = 10;
        Integer obji = Integer.valueOf(a); // Modern replacement for deprecated 'new Integer(a)'

        // wrapping double to Double
        double d = 10.5;
        Double objd = Double.valueOf(d); // Modern replacement for deprecated 'new Double(d)'

        // wrapping char to Character
        char c = 'x';
        Character objc = Character.valueOf(c); // Modern replacement for deprecated 'new Character(c)'

        System.out.println("After Wrapping...");
        System.out.println("Integer= " + obji);
        System.out.println("Double= " + objd);
        System.out.println("Character= " + objc);

        // unwrapping Integer to int
        int a1 = obji;

        // unwrapping Double to double
        double d1 = objd;

        // unwrapping Character to char
        char c1 = objc;

        System.out.println("After UnWrapping...");
        System.out.println("int= " + a1);
        System.out.println("double= " + d1);
        System.out.println("char= " + c1);
    }
}