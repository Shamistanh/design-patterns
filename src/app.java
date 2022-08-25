public class app {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new BP();
        Developer m = abstractFactory.hireDeveloper("M");
        System.out.println(m.getSalary());

        ProductOwner j = abstractFactory.hireProductOwner("J");
        System.out.println(j.getSalary());
    }
}
