public class BP extends AbstractFactory {
    @Override
    public Developer hireDeveloper(String developer) {
        if (developer.equals("J")){
            return new JrDeveloper();
        } else if (developer.equals("M")){
            return new MidDeveloper();
        }else if (developer.equals("S")){
            return new SrDeveloper();
        }
        return null;
    }

    @Override
    public ProductOwner hireProductOwner(String productOwner) {
        if (productOwner.equals("S")){
            return new SrProductOwner();
        }else if(productOwner.equals("M")){
            return new MidProductOwner();
        }else if (productOwner.equals("J")){
            return new JrProductOwner();
        }
        return null;
    }
}
