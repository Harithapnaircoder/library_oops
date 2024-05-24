public class Professor extends LibraryUser {
    int employeeId;
    String department;

    public Professor(int userId, String name, String userType, int employeeId, String department) {
        super(userId, name, userType);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String displayProfessorInfo() {
        return "\nEmployee ID: " + employeeId + "\nDepartment: " +
                department + "\n" + super.displayInfo();
    }
}

