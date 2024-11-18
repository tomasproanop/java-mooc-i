import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> gradeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int sumPassing = 0;

        double average = 0;
        double averagePassing = 0;

        int passingCounter = 0;
        double passPercentage = 0;
        int generalCounter = 0;

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input >= 0 && input <= 100) {
                gradeList.add(input);
                sum += input;
                generalCounter++;

                if (input >= 50) {
                    sumPassing += input;
                    passingCounter++;
                }
            }
        }

        // Calculate averages and percentages
        average = (generalCounter > 0) ? (double) sum / generalCounter : 0;
        averagePassing = (passingCounter > 0) ? (double) sumPassing / passingCounter : 0;
        passPercentage = (generalCounter > 0) ? 100.0 * passingCounter / generalCounter : 0;

        System.out.println("Point average (all): " + average);

        if (passingCounter == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + averagePassing);
        }

        System.out.println("Pass percentage: " + passPercentage);

        // Calculate grade distribution
        int[] gradeDistArr = new int[6];

        for (int grade : gradeList) {
            if (grade >= 90) {
                gradeDistArr[0]++;
            } else if (grade >= 80) {
                gradeDistArr[1]++;
            } else if (grade >= 70) {
                gradeDistArr[2]++;
            } else if (grade >= 60) {
                gradeDistArr[3]++;
            } else if (grade >= 50) {
                gradeDistArr[4]++;
            } else {
                gradeDistArr[5]++;
            }
        }

        // Print grade distribution
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeDistArr[5 - i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
