import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // insert test code here
        int[] array = { 3, 1, 5, 99, 3, 12 };
        System.out.println(Arrays.toString(array));

        sort(array);

        System.out.println(Arrays.toString(array));

    }

    public static void sort(int[] array) {
        // that sorts an array of integers.
        Arrays.sort(array);
    }

    public static void sort(String[] array) {

        Arrays.sort(array);

    }

    public static void sortIntegers(ArrayList<Integer> integers) {

        Collections.sort(integers);

    }// that sorts a list of integers.

    public static void sortStrings(ArrayList<String> strings) {

        Collections.sort(strings);

    }// that sorts a list of strings.

}