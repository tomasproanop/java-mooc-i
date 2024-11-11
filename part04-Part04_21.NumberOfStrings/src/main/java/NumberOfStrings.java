
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {

        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
       
            if (line.equals("end")) {
                System.out.println(counter);
                break;
            }

            counter += 1;
        }
    }

}