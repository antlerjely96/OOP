package CreationalPatterns.Builder.House;

public class Director {
    public HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructorHouseBuild(){
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        houseBuilder.buildDoor();
        houseBuilder.buildWindow();
        houseBuilder.buildGarage();
        houseBuilder.buildGarden();
    }
}
