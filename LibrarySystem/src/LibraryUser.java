import java.util.Scanner;

public class LibraryUser {
    int userId;
    String name;
    String userType;

    public LibraryUser(int userId, String name, String userType) {
        this.userId = userId;
        this.name = name;
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getUserType() {
        return userType;
    }

    public String displayInfo() {
        return "User ID: " + userId + "\nName: " + name + "\nUser Type: " + userType;
    }

    public static Boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of books you want to borrow:");
            int numBooks = sc.nextInt();
            if (numBooks <= book.availableCopies) {
                book.borrow(numBooks);
                return true;
            } else {
                System.out.println("Sorry, there are not enough copies available.");
                return false;
            }
        } else {
            System.out.println("Sorry, the book '" + book.title + "' is not available at the moment.");
            return false;
        }
    }

    public static void returnBook(Book book) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books you want to return:");
        int numBooks = sc.nextInt();
        if (numBooks <= book.totalCopies - book.availableCopies) {
            book.returnBook(numBooks);
        } else {
            System.out.println("Invalid number of books to return.");
        }
    }
}

