package lab2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {
    @Test
    public void testGroup(){
        Group group = new Group("124-16-1");
        assertEquals("124-16-1",  group.getName());
        Calendar birthday = new GregorianCalendar(1999, Calendar.FEBRUARY, 1);
        Student student = new Student("John", "Jackson", birthday, 352);
        boolean isAdded = group.addStudent(student);
        assertTrue(isAdded);
        student.setGroup(group);
        assertEquals(student, group.getStudents().get(0));
        isAdded = group.addStudent("John", "Jackson", birthday, 352);
        assertTrue(isAdded);
        assertEquals(group.getStudents().get(0).getGroup(), group);
        isAdded = group.addStudent("John", "Jackson", birthday);
        assertTrue(isAdded);
        Student student2 = new Student("Jack", "Johnson", birthday, 43124);
        List<Student> students = new ArrayList<>(2);
        students.add(student);
        students.add(student2);
        Group newGroup = new Group("148-22-8", students);
        assertEquals(2, newGroup.getStudents().size());
    }
}