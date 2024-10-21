
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int numberToPrint = 0;
        int index = 0;
        
        while (index < array.length - 1) {
            numberToPrint = array[index];
            System.out.print(numberToPrint + ", ");
            index = index + 1; 
        }
        
        if (index + 1 == array.length) {
            System.out.print(array[index]);
        }
    }
}
