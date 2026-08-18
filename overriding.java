 class human{
    public void eat () {
        System.out.println("human is eating");
    }
}
class boy extends human {
    public void eat () {
        System.out.println("boy is eating ");
    }
}
public class overriding {
public static void main(String args[]) {
human obj = new human();
    obj.eat();
    boy obj1 = new boy();
    obj1.eat();
}}