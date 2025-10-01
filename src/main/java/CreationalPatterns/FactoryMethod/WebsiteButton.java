package CreationalPatterns.FactoryMethod;

public class WebsiteButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Website Button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicked Website Button");
    }
}
