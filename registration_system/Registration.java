import java.util.ArrayList;
class Registration {
    private ArrayList<Student> students;

    public Registration() {
        students = new ArrayList<>();
    }
    // Add a new student to the registration system
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student registered successfully!");
    }
    // Display all registered students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered yet.");
        } 
        else {
            System.out.println("Registered Students:");
            for (Student student : students) {
                student.displayDetails(); // Polymorphism - calling overridden method
                System.out.println("---------------------------");
            }
        }
    }
}

