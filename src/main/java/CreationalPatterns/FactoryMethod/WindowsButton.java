package CreationalPatterns.FactoryMethod;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Render windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicked windows button");
    }
}
