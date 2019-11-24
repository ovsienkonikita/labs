package lab2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testStudent() {
        Calendar birthday = new GregorianCalendar(1999, Calendar.FEBRUARY, 1);
        Student student = new Student("John", "Jackson", birthday, 352);
        assertEquals("John", student.getName());
        assertEquals("Jackson", student.getSurname());
        assertEquals(birthday, student.getBirthday());
        assertEquals("John Jackson", student.getFullName());
        assertFalse(student.isOnBudget());
        student.setOnBudget(true);
        assertTrue(student.isOnBudget());
    }

    @Test
    public void testStudentPhoneNumbers() {
        Calendar birthday = new GregorianCalendar(1999, Calendar.FEBRUARY, 1);
        Student student = new Student("Jack", "Johnson", birthday);
        assertEquals(new ArrayList<Number>(), student.getPhoneNumbers());
        student.addPhoneNumber(234512451);
        ArrayList<Number> expected = new ArrayList<>();
        expected.add(234512451);
        assertEquals(expected, student.getPhoneNumbers());
        Student newStudent = new Student("Jack", "Johnson", birthday, expected);
        assertEquals(expected, newStudent.getPhoneNumbers());
    }
}