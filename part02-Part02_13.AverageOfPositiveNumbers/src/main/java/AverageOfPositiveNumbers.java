
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double averagePositiveNumbers = 0;
        int counterPositiveNumbers = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

            if (number < 0) {
                //counter = counter + 1;
                //sum = number + sum;
                continue;
            }
            
            if (number > 0) {
                counterPositiveNumbers = counterPositiveNumbers + 1;
                sum = number + sum;
                continue;
            }       
        }      
        averagePositiveNumbers = (double) sum / (double) counterPositiveNumbers;
        System.out.println("Average of the numbers: " + averagePositiveNumbers);
    }
}
