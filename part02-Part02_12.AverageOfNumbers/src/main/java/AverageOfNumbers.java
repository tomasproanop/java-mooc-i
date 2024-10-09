
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double average = 0;
        int counter = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                counter = counter + 1;
                sum = number + sum;
                continue;
            }
            
            if (number > 0) {
                counter = counter + 1;
                sum = number + sum;
                continue;
            }       
        }      
        average = (double) sum / (double) counter;
        System.out.println("Average of the numbers: " + average);
    }
}
