package be.pxl;

public class Student extends Person {
    int grade;

    public Student(String name, int age) {
        super(name, age);
    }

    void fillInExam() {
        grade = 2;
    }
}
