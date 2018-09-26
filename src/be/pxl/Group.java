package be.pxl;

import java.util.List;

public class Group {
    List people;

    public Group(List people) {
        this.people = people;
    }

    public void organiseExam() {
        for (Object person : people) {
            Student student = (Student) person;
            student.fillInExam();
        }
    }
}
