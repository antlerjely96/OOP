package CreationalPatterns.Builder.House;

import java.util.Scanner;

public class VillaHouse implements HouseBuilder{
    Scanner scanner = new Scanner(System.in);
    private House house = new House();
    @Override
    public void buildWall() {
        System.out.print("Wall: ");
        house.setWalls(scanner.nextLine());
    }

    @Override
    public void buildRoof() {
        System.out.print("Roof: ");
        house.setRoof(scanner.nextLine());
    }

    @Override
    public void buildDoor() {
        System.out.print("Door: ");
        house.setDoors(scanner.nextLine());
    }

    @Override
    public void buildWindow() {
        System.out.print("Window: ");
        house.setWindows(scanner.nextLine());
    }

    @Override
    public void buildGarage() {
        System.out.print("Garage: ");
        house.setGarden(scanner.nextLine());
    }

    @Override
    public void buildGarden() {
        System.out.print("Garden: ");
        house.setGarden(scanner.nextLine());
    }

    @Override
    public House getHouse() {
        return house;
    }
}
