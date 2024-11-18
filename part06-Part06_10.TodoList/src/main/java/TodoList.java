import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList(){
        list = new ArrayList<>();
    }


    public void add(String task) {
        //add the task passed as a parameter to the todo list.
        list.add(task);

    }
    public void print(){
        int index = 0;

        for(String item : list){

            System.out.println(index+1 +": " + item);
            index++;
        }

        //- prints the exercises. 
        //Each task has a number associated with it on the print statement 
        //— use the task's index here (+1).

    } 
    public void remove(int number) {
        //- removes the task associated with the given number; 
        //the number is the one seen associated with the task in the print.
        
        list.remove(number-1);

    }
    
}
