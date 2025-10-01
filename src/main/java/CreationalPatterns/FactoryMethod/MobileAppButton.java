package CreationalPatterns.FactoryMethod;

public class MobileAppButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Mobile App Button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicked Mobile App Button");
    }
}
