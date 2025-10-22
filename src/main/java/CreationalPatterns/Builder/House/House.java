package CreationalPatterns.Builder.House;

public class House {
    private String walls;
    private String roof;
    private String doors;
    private String windows;
    private String garage;
    private String garden;

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", doors='" + doors + '\'' +
                ", windows='" + windows + '\'' +
                ", garage='" + garage + '\'' +
                ", garden='" + garden + '\'' +
                '}';
    }
}
