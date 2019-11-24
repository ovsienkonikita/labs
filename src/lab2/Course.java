package lab2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Group> groups;
    private Faculty faculty = null;

    public Course(String name, List<Group> groups) {
        this.name = name;
        this.groups = groups;
        changeCourseForAllGroups();
    }

    public Course(String name){
        this.name = name;
        this.groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty){
        this.faculty = faculty;
    }

    public boolean addGroup(Group group) {
        group.setCourse(this);
        return groups.add(group);
    }

    public boolean addGroup(String name, List<Student> students){
        Group group = new Group(name, students);
        group.setCourse(this);
        return groups.add(group);
    }

    private void changeCourseForAllGroups(){
        for (Group group: groups){
            group.setCourse(this);
        }
    }

}
