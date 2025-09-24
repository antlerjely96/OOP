package CreationalPatterns.Singleton;

public class Singleton {
    private static Singleton instance;
    private static String name;

    private Singleton(String name) {
        this.name = name;
    }

    public static synchronized Singleton getInstance(String name) {
        if (instance == null) {
            instance = new Singleton(name);
        }
        return instance;
    }

    public void printName(){
        System.out.println(this.name);
    }
}
