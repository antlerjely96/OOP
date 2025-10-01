package CreationalPatterns.FactoryMethod;

public abstract class Dialog {
    public void renderButton(){
        Button button = createButton();
        button.render();
        button.onClick();
    }
    //Factory
    public abstract Button createButton();
}
