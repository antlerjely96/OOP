package CreationalPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingBuilder = new GamingComputer();
        Director director = new Director(gamingBuilder);
        director.constructorComputer();
        Computer gamingComputer = gamingBuilder.getResult();
        System.out.println(gamingComputer);
    }
}
