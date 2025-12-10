package model;

public class Student {

    private int studentId;
    private String name;
    private String department;
    private int marks;

    public Student(int studentId, String name, String department, int marks) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getMarks() {
        return marks;
    }
}

