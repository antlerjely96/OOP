package CreationalPatterns.Builder.House;

public interface HouseBuilder {
    void buildWall();
    void buildRoof();
    void buildDoor();
    void buildWindow();
    void buildGarage();
    void buildGarden();
    House getHouse();
}
