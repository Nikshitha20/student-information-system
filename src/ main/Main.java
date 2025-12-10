package main;

import model.Student;
import dao.StudentDAO;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(101, "Nikshitha", "CSE", 85);

        StudentDAO dao = new StudentDAO();
        dao.addStudent(student);
        dao.getStudent(101);
    }
}

