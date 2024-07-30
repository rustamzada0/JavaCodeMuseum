package Interface;

// Apple.java
public class AppleInterface implements Device {
    private String model;
    private int year;
    private String color;

    public AppleInterface(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Apple Device - Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}
