import java.util.ArrayList;
import java.util.Scanner;
public class StudentRegistration {
    public static void main(String[] args) {
        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Display menu options
            System.out.println("Student Registration");
            System.out.println("------------------------------");
            System.out.println("1. Register a new student");
            System.out.println("2. Display registered students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                 // Register a new student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter student phone number: ");
                    int phone_number = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    System.out.print("Enter student email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter student department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter student acadamic year: ");
                    int acadamic_year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student semester: ");
                    int semester = scanner.nextInt();
                    scanner.nextLine();

                    Student student = new Student(name, id, phone_number, email, department, acadamic_year, semester);
                    registration.addStudent(student);
                    break;
                case 2:
                // Display registered students
                    registration.displayStudents();
                    break;
                case 3:
                // Exit the program
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                // Handle invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        catch (NumberFormatException e) {
            // Handle invalid number format
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An error occurred. Please try again.");
            scanner.nextLine(); // Clear the input buffer
        }
        }
    }
}
