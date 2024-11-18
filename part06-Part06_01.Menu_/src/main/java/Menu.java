
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    /**
     * Adds a meal to the menu. 
     * If the meal is already on the list, it should not be added again.
     * @param meal
     */
    public void addMeal(String meal) {

        if (meals.contains(meal)){

        } else {
            meals.add(meal);
        }
    }

    /**
     * Prints the meals
     */
    public void printMeals() {
        for (String meal : meals){
            System.out.println(meal);
        }
    }

    /**
     * Clears the menu
     */
    public void clearMenu() {
            meals.clear();
    }


    // implement the required methods here
}
