public class EmployeeBuilder {
    double salary;
    long id;
    String name;
    int experienceInMonth;

    public EmployeeBuilder salary(double salary){
        this.salary = salary;
        return this;
    }
    public EmployeeBuilder id(long id){
        this.id = id;
        return this;
    }

    public EmployeeBuilder name(String name){
        this.name = name;
        return this;
    }

    public EmployeeBuilder experienceInMonth(int experienceInMonth){
        this.experienceInMonth = experienceInMonth;
        return this;
    }

    public Employee build(){
        return new Employee(salary,id,name,experienceInMonth);
    }
}
