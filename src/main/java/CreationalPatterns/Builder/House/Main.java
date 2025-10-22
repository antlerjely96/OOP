package CreationalPatterns.Builder.House;



public class Main {
    public static void main(String[] args) {
        HouseBuilder villaHouse = new VillaHouse();
        Director director = new Director(villaHouse);
        director.constructorHouseBuild();
        House house = villaHouse.getHouse();
        System.out.println(house);
    }
}
