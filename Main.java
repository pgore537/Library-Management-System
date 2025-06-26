import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Sample books
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("1984", "George Orwell"));

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String titleToIssue = scanner.nextLine();
                    library.issueBook(titleToIssue);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = scanner.nextLine();
                    library.returnBook(titleToReturn);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

