package lab2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course;

    @BeforeEach
    void setUp() {
        Group group = new Group("124-16-1");
        Calendar birthday = new GregorianCalendar(1999, Calendar.FEBRUARY, 1);
        Student student = new Student("John", "Jackson", birthday, 352);
        group.addStudent(student);
        ArrayList<Group> groups = new ArrayList<>();
        groups.add(group);
        this.course = new Course("SA", groups);
    }

    @Test
    void getName() {
        assertEquals("SA", this.course.getName());
    }

    @Test
    void getGroups() {
        List<Group> groups = this.course.getGroups();
        Group group = groups.get(0);
        assertEquals("124-16-1", group.getName());
        assertEquals(this.course, group.getCourse());

    }

    @Test
    void testAddGroup() {
        Calendar birthday = new GregorianCalendar(1999, Calendar.FEBRUARY, 1);
        Student student = new Student("John", "Jackson", birthday, 352);
        Student student2 = new Student("Jack", "Johnson", birthday, 43124);
        List<Student> students = new ArrayList<>(2);
        students.add(student);
        students.add(student2);
        Group newGroup = new Group("148-22-8", students);
        boolean isAdded = this.course.addGroup(newGroup);
        assertTrue(isAdded);
        isAdded = this.course.addGroup("3480123", students);
        assertTrue(isAdded);
    }
}