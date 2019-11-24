package lab2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private Calendar birthday;
    private Boolean onBudget;
    private List<Number> phoneNumbers;
    private Group group;

    public Student(String name, String surname, Calendar birthday, List<Number> phoneNumbers) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.onBudget = Boolean.FALSE;
        this.phoneNumbers = phoneNumbers;
    }

    public Student(String name, String surname, Calendar birthday, Number phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.onBudget = Boolean.FALSE;
        this.phoneNumbers = new ArrayList<>();
        this.phoneNumbers.add(phoneNumber);
    }

    public Student(String name, String surname, Calendar birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.onBudget = Boolean.FALSE;
        this.phoneNumbers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public Boolean isOnBudget() {
        return onBudget;
    }

    public void setOnBudget(Boolean onBudget) {
        this.onBudget = onBudget;
    }

    public List<Number> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(Number phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
