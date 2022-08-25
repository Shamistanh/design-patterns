public class DeveloperFactory {

    public Developer getDeveloper(String employeeDesc) {
        if (employeeDesc.equals("J")) {
            return new JrDeveloper();
        } else if (employeeDesc.equals("S")) {
            return new SrDeveloper();
        } else if (employeeDesc.equals("M")) {
            return new MidDeveloper();
        }
        return null;
    }
}
