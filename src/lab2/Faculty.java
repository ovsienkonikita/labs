package lab2;

import java.util.List;

public class Faculty {
    private String name;
    private List<Course> courses;
    private University university = null;

    public Faculty(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public boolean addCourse(Course course) {
        course.setFaculty(this);
        return courses.add(course);
    }

    public boolean addCourse(String name, List<Group> groups){
        Course course = new Course(name, groups);
        course.setFaculty(this);
        return courses.add(course);
    }

    public String getName() {
        return name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university){
        this.university = university;
    }
}
