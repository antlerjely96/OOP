package CreationalPatterns.Singleton;

import static CreationalPatterns.Singleton.Singleton.getInstance;

public class Main {
    public static void main(String[] args) {
        Singleton cat = getInstance("Persian");
        cat.printName();
        System.out.println("---------------------");
        Singleton dog = getInstance("Shiba");
        dog.printName();
    }
}
