package Abstract;

public class Computer extends AppleAbstract{
    private String gpuName;

    // Constructor
    public Computer(String model, int year, String color, String gpuName) {
        super(model, year, color);
        this.gpuName = gpuName;
    }

    public Computer(){}

    // Polmorfizm - super'den bezi methodlar inherit olaraq gelir deye istifade ede bilirik
    // Abstarct methoddur deye mutleg istifade etmeliyik
    @Override
    public void displayDetails() {
        System.out.println("Smartphone [Model: " + getModel() + ", Year: " + getYear() + ", Color: " + getColor() + ", Gpu: " + getGpuName() + "]");
    }

    // Getter and Setter for operatingSystem
    public String getGpuName() {
        return gpuName;
    }

    public void setGpuName(String cpuName) {
        this.gpuName = gpuName;
    }
}
