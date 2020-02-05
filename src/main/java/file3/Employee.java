package file3;

import java.util.Calendar;

public class Employee {

    private String surname;
    private String post;
    private int salary;
    private int yearBirth;

    public Employee() {
        surname = "";
        post = "";
        salary = 0;
        yearBirth = 0;
    }

    public Employee(String surname, String post, int salary, int yearBirth) {
        this.surname = surname;
        this.post = post;
        this.salary = salary;
        this.yearBirth = yearBirth;
    }

    public Employee(String surname, int salary, int yearBirth) {
        this.surname = surname;
        post = "";
        this.salary = salary;
        this.yearBirth = yearBirth;
    }

    public void increaseSalary() {
        salary += salary * 0.15;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearBirth;
    }

    public void getInfo() {
        System.out.printf("Фамилия: %s\nДолжность: %s\nОклад: %d\nГод рождения: %d\nВозраст: %d\n\n",
                surname, post, salary, yearBirth, getAge());
    }
}
