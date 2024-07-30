package Interface;

public class ComputerInterface implements Device {
    private String model;
    private String processor;

    public ComputerInterface(String model, String processor) {
        this.model = model;
        this.processor = processor;
    }

    @Override
    public void displayInfo() {
        System.out.println("Computer - Model: " + model + ", Processor: " + processor);
    }
}
