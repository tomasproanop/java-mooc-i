
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        // Declare variables
        int sum = 0;
        int counter = 0;
        double average = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1){
                
                break;
            } else {
                sum = sum + number;
                counter = counter + 1;
                
                if(number % 2 == 0) {
                    evenCounter = evenCounter + 1;
                } else {
                    oddCounter = oddCounter + 1;
                }
                continue;
            }
        }
        
        average = (double) sum / (double) counter;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);
    }     
}
