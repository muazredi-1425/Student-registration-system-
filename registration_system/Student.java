import java.util.ArrayList;
import java.util.Scanner;

class Student extends Person {
    private String id;
    private int phone_number;
    private String email;
    private String department; 
    private int acadamic_year;
    private int semester;


    public Student(String name, String id, int phone_number, String email, String department, int acadamic_year, int semester) {       
        super(name);
        this.id = id;
        this.phone_number = phone_number;
        this.email = email;
        this.department = department;
        this.acadamic_year = acadamic_year;
        this.semester = semester;
    }

    public String getId() {
        return id;
    }

    public int getPhone() {
        return phone_number;
    }
    
    public String getEmail() {
        return email;
    }

    public String getDep() {
        return department;
    }

    public int getYear() {
        return acadamic_year;
    }

    public int getSem() {
        return semester;
    }
     // Implementing abstract method to display student details
    @Override
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Phone_number: " + phone_number);
        System.out.println("Student Email: " + email);
        System.out.println("Student Department: " + department);
        System.out.println("Student Acadamic_year: " + acadamic_year);
        System.out.println("Student Semester: " + semester);

    }
}

