import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stackList;

    public Stack(){
        this.stackList = new ArrayList<>();
    }

    /**
     * returns a boolean-type value (true or false) 
     * that tells whether or not the stack is empty
     * @return boolean
     */
    public boolean isEmpty(){

        if (stackList.isEmpty()){
            return true;
        }
        return false;
    } 

    /**
     * Adds the value given as a parameter to the top of the stack.
     * @param value
     */
    public void add(String value) {
        if (!stackList.contains(value)){
            stackList.add(value);
        }
    }

    /**
     * returns the values ​​contained in the stack as a list.
     */
    public ArrayList<String> values() {
        return this.stackList;
    }

    public String take(){
        return this.stackList.remove(this.stackList.size() -1);

    }
}
