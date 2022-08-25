public class EmployeeFactory {

    public Employee getEmployee(String employeeDesc) {
        if (employeeDesc.equals("J")) {
            return new JrEmployee();
        } else if (employeeDesc.equals("S")) {
            return new SrEmployee();
        } else if (employeeDesc.equals("M")) {
            return new MidEmployee();
        }
        return null;
    }
}
