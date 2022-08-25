public class Employee {
    double salary;
    long id;
    String name;
    int experienceInMonth;

    public Employee(double salary, long id, String name, int experienceInMonth) {
        this.salary = salary;
        this.id = id;
        this.name = name;
        this.experienceInMonth = experienceInMonth;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", experienceInMonth=" + experienceInMonth +
                '}';
    }

}
