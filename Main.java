import Abstract.AppleAbstract;
import Abstract.Smartphone;

//Evet, doğru. Java'da her .java dosyasında yalnızca bir tane public sınıf olabilir,
// ve bu sınıfın adı dosya adıyla aynı olmalıdır
public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");

        System.out.println(Apple.companyName);

        // final icaze vermir
        // Apple.companyName = "New Apple Inc.";

        Apple obj1 = new Apple("Iphone 15 pro", 2023, "Natural");
        System.out.println(obj1);
        // System.out.println(obj1.model); error
        System.out.println(obj1.getModel());
        System.out.println(obj1.getYear());
        obj1.setColor("Black");
        System.out.println(obj1.getColor());

        Apple obj2 = new Apple();
        System.out.println(obj2);

        Smartphone obj3 = new Smartphone("Iphone 14 pro", 2023, "Purple", "A17");
        // System.out.println(obj3.getModel() + " " + obj3.getCpuName());
        obj3.displayDetails();
    }
}


// Xeta verecek (public-e gore)
//public class Apple {
//    public static final String companyName = "Apple Inc. ";
//
//}

// public-siz yazmag olur (Bir .java file-sinde)
class Samsung {
    public static final String companyName = "Samsung";
}