public class Main {
    public static void main(String[] args) {

        Book Book1 = new Book("Half Girlfriend", "Chetan Bhagat", "123", 2, 45);
        Book Book2 = new Book("A Sense of Time", "H.S. Vatsyayan", "234", 39, 47);
        Book Book3 = new Book("A Brush with Life ", "Satish Gujral", "23", 39, 0);
        Book1.borrow(2);
        Book2.returnBook(2);
        System.out.println(Book3.ISBN);
        Book3.isAvailable();
        Book1.isAvailable();

        Author author1 = new Author("Edgar Allan Poe", "September 1, 1992", "Edgar Allan Poe, (born January 19, 1809, Boston, Massachusetts, U.S.—died October 7, 1849, Baltimore, Maryland), American short-story writer, poet, critic, and editor who is famous for his cultivation of mystery and the macabre.");
        Author author2 = new Author("Helen Adams Keller", "June 27, 1880", "Helen Adams Keller (June 27, 1880 – June 1, 1968) was an American author, disability rights advocate, political activist and lecturer. Born in West Tuscumbia, Alabama, she lost her sight and her hearing after a bout of illness when she was 19 months old.");
        System.out.println("\nAuthor information: " + author1.getAuthorInfo());
        System.out.println("\nAuthor information: " + author2.getAuthorInfo());

        LibraryUser anu = new LibraryUser(126, "A Sense of Time", "student");
        System.out.println(anu.displayInfo());
        LibraryUser anju = new LibraryUser(123, "Half Girlfriend", "professor");
        System.out.println(anju.displayInfo());
        System.out.println(anu.getName());
        LibraryUser.borrowBook(Book2);
        LibraryUser.returnBook(Book3);
        System.out.println("User ID of Anu: " + anu.getUserId());
        System.out.println("User Type of Anu: " + anu.getUserType());


        Student student1 = new Student(1243, "Haritha P Nair", "student", 12, 2023);
        System.out.println("\nStudent details are: " + student1.displayStudentInfo());
        String StudentUserType =student1.getUserType();
        System.out.println("professorUserType: " + StudentUserType);

        Professor professor1 = new Professor(234, "Seetha K", "Professor", 111, "sales");
        System.out.println("\nProfessor details are: " + professor1.displayProfessorInfo());
        String professorUserType = professor1.getUserType();
        System.out.println("professorUserType: " + professorUserType);
        int professorUserId = professor1.getUserId();
        System.out.println("professorUserId: " + professorUserId);
        System.out.println(professor1.getUserType());
    }
}
