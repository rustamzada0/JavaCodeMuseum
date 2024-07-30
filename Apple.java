public class Apple {

    // Class attribute
    // static - olmalidir ki obj yaratmadan bir basa Apple.companyName ederek print-e companyname cixardaq (Pythonda class atributda ehtiyac olmur ama methodlarda @staticmethod ehtiyac olur)
    // final - olmalidir ki biz 'Apple.companyName = "New Apple Inc."; ede bilmiyek
    public static final String companyName = "Apple";

    // Instance attributes
    private String model;
    private int year;
    private String color;

    // Constructor (public, protected, private ola bilir)
    public Apple(String model, int year, String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Getters
    public String getModel(){
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Boş Constructor "Apple obj2 = new Apple();" - uchun
    public Apple(){}



    // constructor private olsa da obj yarada bilirik cunki eyni class icindeyik
    public static void main(String[] args){
        Apple obj = new Apple("Iphone 11", 2015, "White");

        // private constructor olanda yalniz eyni class icinde cata bilirik (Misal ucun: obj.model)
        System.out.println(obj.model);
    }
}


// bir class private, protected ve ya default ola bilmez
//private class Apple {
//    public static final String companyName = "Apple Inc. ";
//}