package CreationalPatterns.Builder;

//Builder: Abstract class hoặc interface được dùng để khai báo các phương thức khởi tạo đối tượng
public interface ComputerBuilder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    void buildGPU();
    void buildScreen();
    Computer getResult();
}
