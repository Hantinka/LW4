import java.util.Calendar;

/**
 * Created by Irina on 26.08.2016.
 */
public class Teacher extends Person {
    protected String department;
    protected String position;

    Teacher(String name, String surname, Calendar dateOfBirth, String department, String position) {
        super(name, surname, dateOfBirth);
        this.department = department;
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return "Имя: " + name + "\n" + "Фамилия: " + surname + "\n" + "Дата рождения: " + dateOfBirth.getTime() + "\n" + "Кафедра: " + department + "\n" + "Должность: " + position;
    }
}
