package Abstract;

public class Smartphone extends AppleAbstract {
    private String cpuName;

    // Constructor
    public Smartphone(String model, int year, String color, String cpuName) {
        super(model, year, color);
        this.cpuName = cpuName;
    }

    public Smartphone(){}

    // Polmorfizm - super'den bezi methodlar inherit olaraq gelir deye istifade ede bilirik
    // Abstarct methoddur deye mutleg istifade etmeliyik
    @Override
    public void displayDetails() {
        System.out.println("Smartphone [Model: " + getModel() + ", Year: " + getYear() + ", Color: " + getColor() + ", Cpu: " + getCpuName() + "]");
    }

    // Getter and Setter for operatingSystem
    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }
}
