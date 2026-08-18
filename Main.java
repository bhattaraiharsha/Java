
class Test {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age > 0) { 
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
    }
    public class Main {
        public static void main(String[] args) {
            Test person = new Test();
            person.setName("John");
            person.setAge(25);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }
