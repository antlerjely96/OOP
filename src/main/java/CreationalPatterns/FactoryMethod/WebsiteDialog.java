package CreationalPatterns.FactoryMethod;

public class WebsiteDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WebsiteButton();
    }
}
