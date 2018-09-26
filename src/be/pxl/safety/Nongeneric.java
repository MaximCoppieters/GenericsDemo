package be.pxl.safety;

import be.pxl.Group;
import be.pxl.Lector;
import be.pxl.Student;

import java.util.ArrayList;
import java.util.List;

public class Nongeneric {
    public static void main(String[] args) {
        List students = new ArrayList();

        Student alice = new Student("Alice", 20);
        Student bob = new Student("Bob", 23);
        Lector lector = new Lector("Jan", 47);

        students.add(alice);
        students.add(bob);
        students.add(lector); // Zal falen bij runtime

        Group classGroup = new Group(students);

        classGroup.organiseExam();
    }
}
