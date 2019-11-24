package lab2;

import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties;

    public University(String name, List<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public boolean addFaculty(Faculty faculty) {
        if (faculty.getUniversity().getName().equals(this.name)) {
            return faculties.add(faculty);
        }
        return false;
    }

    public boolean addFaculty(String name, List<Course> courses){
        return faculties.add( new Faculty(name, courses));
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public String getName() {
        return name;
    }
}
