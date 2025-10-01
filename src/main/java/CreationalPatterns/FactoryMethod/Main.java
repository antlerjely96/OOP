package CreationalPatterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Dialog dialog;
        dialog = new WindowsDialog();
        dialog.renderButton();
        System.out.println("-----------------");
        dialog = new WebsiteDialog();
        dialog.renderButton();
        System.out.println("-----------------");
        dialog = new MobileAppDialog();
        dialog.renderButton();
    }
}
