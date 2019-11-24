package lab2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Group {
    private String name;
    private Course course = null;
    private List<Student> students;

    public Group(String name, List<Student> students) {
        this.name = name;
        this.students = students;
        changeGroupOfStudents();
    }

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean addStudent(Student student) {
        student.setGroup(this);
        return students.add(student);
    }

    public boolean addStudent(String name, String surname, Calendar birthday, Number phoneNumber) {
        Student student = new Student(name, surname, birthday, phoneNumber);
        return students.add(student);
    }

    public boolean addStudent(String name, String surname, Calendar birthday) {
        Student student = new Student(name, surname, birthday);
        return students.add(student);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    private void changeGroupOfStudents() {
        for (Student student : students) {
            student.setGroup(this);
        }
    }

}
