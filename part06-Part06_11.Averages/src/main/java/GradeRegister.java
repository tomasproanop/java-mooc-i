
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointsList;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointsList = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.pointsList.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades(){
        double average = 0;
        int counter = 0;
        int sum = 0;

        if (grades.isEmpty()) {
            return average = -1;
        }

        for(Integer grade : grades){
            sum = grade + sum;
            counter++;
        }

        pointsToGrade(sum);

        average = (double) sum / (double) counter;
        return average;
    }

    public double averageOfPoints() {

        double average = 0;
        int counter = 0;
        int sum = 0;

        if (pointsList.isEmpty()) {
            return average = -1;
        }

        for(Integer points : pointsList){
            sum = points + sum;
            counter++;
        }

        average = (double)sum / (double)counter;
        return average;
    }
}
