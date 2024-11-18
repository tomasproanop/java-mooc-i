
import java.util.Scanner;

public class UI {

    private Scanner scanner;
    private BirdData birdlist;

    public UI(Scanner scanner, BirdData birdlist) {
        this.scanner = scanner;
        this.birdlist = birdlist;
    }

    public void start() {
        {
            boolean shouldLoop = true;

            try {
                while (shouldLoop) {
                    System.out.print("? ");

                    String command = scanner.nextLine();

                    switch (command) {
                        case "Quit":
                            shouldLoop = false;
                            break;

                        case "Add":
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                        
                            System.out.print("Name in Latin: ");
                            String latinName = scanner.nextLine();
                            birdlist.addBird(new Bird(name, latinName));
                            break;

                        case "Observation":
                            name = scanner.nextLine();
                            birdlist.addObservation(name);
                            break;

                        case "All":
                            birdlist.printBirdDatabase();
                            break;

                        case "One":
                            name = scanner.nextLine();
                            birdlist.printBird(name);
                            break;

                        default:
                            System.out.println("Unknown command");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}