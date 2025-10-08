package CreationalPatterns.Builder;

//Product: Đối tượng phức tạp mà cần được xây dựng
public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String screen;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
