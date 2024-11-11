
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c = new Counter();

        c.increase();

        c.increase(5);

        System.err.println(c.value());

        
    }
}
