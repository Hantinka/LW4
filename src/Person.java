import java.util.Calendar;

/**
 * Created by Irina on 26.08.2016.
 */
abstract class Person {
    protected String name;
    protected String surname;
    protected Calendar dateOfBirth;

    protected Person (String name, String surname, Calendar dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    protected Person() {
        this.name = "Иван";
        this.surname = "Иванов";
        this.dateOfBirth.set(1983, Calendar.APRIL, 12);
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname (){
        return surname;
    }

    public void setdateOfBirth(Calendar dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public Calendar getdateOfBirth (){
        return dateOfBirth;

    }
    @Override
    public String toString() {
        return "\n" + "Имя: " + name + "\n" + "Фамилия: " + surname + "\n" + "Дата рождения: " + dateOfBirth.getTime();
    }

    public String toShortString(){
        return "\n" + "Имя: " + name + "\n" + "Фамилия: " + surname + "\n";
    }
}


