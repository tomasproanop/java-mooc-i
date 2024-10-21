
public class Smallest {

    public static int smallest(int number1, int number2) {
        
        //int smallest = 0;
        
        if (number1 < number2){
            
            int smallest = number1;
            return smallest;
        }
        
        if (number1 <  0){
            int smallest = number1;
            return smallest;
        } else {
            return number2;
        }        
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
