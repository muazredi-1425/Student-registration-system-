import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class RegistrationTest {

    @Test
    void testUserInput() {
        String input = "Muaz Shewabu\n3543/14\nmuazrei1425@gmail.com\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();

        // Replace the scanner in the StudentRegistration class with the mocked scanner
        StudentRegistration.setScanner(scanner);

        // Call the method that takes user input
        StudentRegistration.registerStudent();

        // Perform assertions based on the expected behavior
        assertEquals(1, registration.getStudents().size());
        assertEquals("Muaz Shewabu", registration.getStudents().get(0).getName());
        assertEquals("3543/14", registration.getStudents().get(0).getId());
        assertEquals("muazrei1425@gmail.com", registration.getStudents().get(0).getEmail());
    }
}