public class app {
    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();

        Employee john = employeeBuilder.name("John").salary(2300).id(5).build();

        System.out.println(john);

        Employee mark = employeeBuilder.name("Mark").salary(4300).id(3).experienceInMonth(120).build();
        System.out.println(mark);


    }
}
