import java.util.Scanner;

public class TextUI{

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){

        String onlyCommand = "end";

        while (true){
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals(onlyCommand)){
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            }

            if (command.equals("search")){
                System.out.println("To be translated: ");
                String word = scanner.nextLine();
                if (dictionary.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println(dictionary.translate(word));
                }
            }
            System.out.println("Unknown command");
        }
    }

    
}