package CreationalPatterns.FactoryMethod;

public class MobileAppDialog extends Dialog{
    @Override
    public Button createButton() {
        return new MobileAppButton();
    }
}
