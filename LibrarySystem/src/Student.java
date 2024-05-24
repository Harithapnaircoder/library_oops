public class Student extends LibraryUser {
    int studentId;
    int yearOfStudy;

    public Student(int userId, String name, String userType, int studentId, int yearOfStudy) {
        super(userId,name, userType);
        this.studentId = studentId;
        this.yearOfStudy = yearOfStudy;
    }

    public String displayStudentInfo() {
        return "Student ID: " + studentId + "\nYear of Study: " +
                yearOfStudy + "\n" + super.displayInfo();
    }
}
