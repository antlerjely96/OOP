package CreationalPatterns.Builder;

public interface ComputerBuilder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    void buildGPU();
    void buildScreen();
    Computer getResult();
}
