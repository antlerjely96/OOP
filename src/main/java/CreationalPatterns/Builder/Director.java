package CreationalPatterns.Builder;

//Director: Điểu khiển quá trình xây dựng
public class Director {
    public ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructorComputer(){
        computerBuilder.buildCPU();
        computerBuilder.buildRAM();
        computerBuilder.buildStorage();
        computerBuilder.buildGPU();
        computerBuilder.buildScreen();
    }
}
