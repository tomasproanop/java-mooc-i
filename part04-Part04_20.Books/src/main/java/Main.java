import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
  
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, pubYear));
        }

        System.out.println("");
        System.out.println("What information will be printed?");
        String what = scanner.nextLine();

        if (what.equals("everything")){

            for(Book boo : books) {
                System.out.println(boo.toString());
            } 
        }

        if (what.equals("name")){

            for(Book boo : books) {
                System.out.println(boo.getTitle());
            } 

        }

    }
}
