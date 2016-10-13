import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Created by Irina on 26.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Иван", "Иванов", new GregorianCalendar(1983, Calendar.APRIL, 15), "2", "12345");
        Teacher t = new Teacher("Пётр", "Петров", new GregorianCalendar(1965, Calendar.APRIL, 26), "Прикладной математики", "Доцент");
        System.out.println(s.toString());
        System.out.println(s.toShortString());
        System.out.println(t.toString());
        System.out.println(t.toShortString());
    }
}
