package CreationalPatterns.Builder;

//ConcreteBuilder: Các cài đặt cụ thể chi tiết cho đối tượng, kế thừa Builder
public class GamingComputer implements ComputerBuilder{

    private Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.setCPU("intel i9");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("32GB");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("500GB");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("RTX 4080");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("17 inch, 4K");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
