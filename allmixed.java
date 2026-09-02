import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// 1. INHERITANCE & THREAD CONTRACT
abstract class Employee implements Runnable {
    private final String name;

    protected Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void clockIn() {
        System.out.println(name + " clocked in on thread: " + Thread.currentThread().getName());
    }

    public abstract void doWork();

    @Override
    public void run() {
        clockIn();
        doWork();
    }
}

// 2. POLYMORPHISM
class Chef extends Employee {
    public Chef(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " is cooking dishes.");
    }
}

class Cleaner extends Employee {
    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " is cleaning floors.");
    }
}

// 3. MAIN ENTRY POINT (Matches file name: allmixed.java)
public class allmixed {
    public static void main(String[] args) {
        Employee chef = new Chef("Marco");
        Employee cleaner = new Cleaner("John");

        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {
            executor.execute(chef);
            executor.execute(cleaner);
        } finally {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }
}