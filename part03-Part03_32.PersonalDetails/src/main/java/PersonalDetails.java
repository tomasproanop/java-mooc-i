import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userNames = new ArrayList<>();
        ArrayList<Integer> userAges = new ArrayList<>();

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.length() > 0) {
                String[] splitStringArray = userInput.split(",");
                userNames.add(splitStringArray[0]);
                userAges.add(Integer.valueOf(splitStringArray[1]));
            } else {
                break;
            }
        }

        String longestName = userNames.get(0);
        int sum = 0;

        // Calculate sum of ages
        for (int i = 0; i < userAges.size(); i++) {
            int number = userAges.get(i);
            sum += number;
        }
        
        // Calculate mean age
        double mean = (double) sum / userAges.size();

        // Find longest name
        for (int i = 1; i < userNames.size(); i++) {
            if (userNames.get(i).length() > longestName.length()) {
                longestName = userNames.get(i);
            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + mean);
    }
}
