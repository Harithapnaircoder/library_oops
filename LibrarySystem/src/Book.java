public class Book {
    static int totalBooks = 0;
    String title;
    String author;
    String ISBN;
    int availableCopies;
    int totalCopies;

    public Book(String title, String author, String ISBN, int availableCopies, int totalCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availableCopies = availableCopies;
        this.totalCopies = totalCopies;
        totalBooks++;
    }

    public void borrow(int numBooks) {
        if (numBooks <= availableCopies) {
            availableCopies -= numBooks;
            totalCopies -= numBooks;
            System.out.println("Successfully borrowed " + numBooks + " copies of " + title);
        } else {
            System.out.println("Not enough copies available to borrow.");
        }
    }

    public void returnBook(int numBooks) {
        if (numBooks <= totalCopies - availableCopies) {
            availableCopies += numBooks;
            totalCopies += numBooks;
            System.out.println("Successfully returned " + numBooks + " copies of " + title);
        } else {
            System.out.println("Invalid number of books to return.");
        }
    }

    public boolean isAvailable() {
        if (availableCopies > 0) {
            System.out.println("Book is available");
            return true;
        } else {
            System.out.println("Book is not available");
            return false;
        }
    }
}


