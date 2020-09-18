package lab1;

import java.util.List;
import java.util.ArrayList;

public class University {
    private String name;
    private int foundationYear;
    private List<Student> students = new ArrayList<>(); // creates a new list

    University(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public void addStudents(Student student) {
        students.add(student);  // add elements to the Student list using add() method
    }

    public float averageUniversityMark() {
        float sum = 0;

        for(Student student: students) {
            sum += student.getMark();
        }
        if(students.size() > 0) {
            return sum / students.size();
        } else {
            return 0;
        }
    }
    public void showStudents() {
        for (Student student: students) {
            System.out.println(student.getStudent());

        }
    }
    public void showUniversity() {
        System.out.println(name);
        System.out.println(foundationYear);
    }
}
