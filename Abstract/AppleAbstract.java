package Abstract;

// public, protected, private variableler rahat islene biler (Source Youtube)
// Abstarct class-da constructor olur
// bir class max bir class-i (abstractclass-i) inherit ede biler ( multiple inherit desteklenmir )

public abstract class AppleAbstract {
    // Class attribute
    public static final String companyName = "Apple";

    // Instance attributes
    private String model;
    private int year;
    private String color;

    // Constructor
    public AppleAbstract(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public AppleAbstract(){}

    // Abstract method to be implemented by subclasses
    // body olmaz {}
    public abstract void displayDetails();

    // Getter methods
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Setter methods
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }
}