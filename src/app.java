public class app {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee m = employeeFactory.getEmployee("J");

        System.out.println(m.getSalary());
    }
}
