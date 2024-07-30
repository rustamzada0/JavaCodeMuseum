package Interface;

public class SmartphoneInterface implements Device {
    private String model;
    private String operatingSystem;

    public SmartphoneInterface(String model, String operatingSystem) {
        this.model = model;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void displayInfo() {
        System.out.println("Smartphone - Model: " + model + ", OS: " + operatingSystem);
    }
}
