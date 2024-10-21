
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        
        int numberToPrint = 0;
        int index = 0;
        int amountOfStars = 0;
        
        while (index < array.length) {
            numberToPrint = array[index];
            amountOfStars = numberToPrint;
            
            for ( int i = 0; i < amountOfStars; i++){
                System.out.print("*");
            }
            System.out.println("");
            index = index + 1; 
        }
    }
}
