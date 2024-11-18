import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner){

        this.todoList = todoList;
        this.scanner = scanner;
        
    }

    public void start(){

        while (true){
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")){
                break;
            }

            if (command.equals("add")){
                System.out.println("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }

            if (command.equals("list")){
                todoList.print();
            }

            if (command.equals("remove")){
                System.out.println("Which one is removed? : ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                todoList.remove(toRemove);
            }

            //System.out.println("Unknown command");
        }
    }

    // Next, implement a class called UserInterface. It should have a constructor with two parameters. The first parameter is an instance of the class TodoList, and the second is an instance of the class Scanner. In addition to the constructor, the class should have the method public void start() that is used to start the text user interface. The text UI works with an eternal looping statement (while-true), and it must offer the following commands to the user:

    // The command stop stops the execution of the loop, after which the execution of the program advances out of the start method.

    // The command add asks the user for the next task to be added. Once the user enters this task, it should be added to the to-do list.

    // The commmand list prints all the tasks on the to-do list.

    // The command remove asks the user to enter the id of the task to be removed. When this has been entered, the specified task should be removed from the list of tasks.

    
}
