package dao;

import model.Student;

public class StudentDAO {

    // Simulated database operation
    public void addStudent(Student student) {
        System.out.println("Student added successfully:");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Marks: " + student.getMarks());
    }

    public void getStudent(int id) {
        System.out.println("Fetching student details for ID: " + id);
        // Database logic would be implemented here
    }
}

