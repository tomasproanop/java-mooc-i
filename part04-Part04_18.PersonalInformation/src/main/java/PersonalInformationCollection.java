
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.print("First name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {

                System.out.println("");
                
                for(PersonalInformation pI : infoCollection) {
                
                System.out.println(pI.getFirstName() + " " + pI.getLastName());
                }     
                break;
            }

            System.out.print("Last name: ");
            String surname = scanner.nextLine();

            System.out.print("Identification number: ");
            String id = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(name, surname, id));
            

        }
    }
}
