import java.util.Calendar;

/**
 * Created by Irina on 26.08.2016.
 */
public class Student extends Person {
    protected String course;
    protected String group;

    Student(String name, String surname, Calendar dateOfBirth, String course, String group) {
        super(name, surname, dateOfBirth);
        this.course = course;
        this.group = group;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" + "Фамилия: " + surname + "\n" + "Дата рождения: " + dateOfBirth.getTime() + "\n" + "Курс: " + course + "\n" + "Группа: " + group;
    }
}