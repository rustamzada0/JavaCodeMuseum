package Interface;

// interface'ler constructor içeremez ve instance variable tanımlayamazlar.


public interface Device {
    // private String model; Mumkun deyil (protected, public fergi yoxdur)

    void displayInfo();
}

// Neden Interface'lerde Constructor ve Instance Variable Yok?
// Interface Amacı: Interface'ler, farklı sınıflar için ortak bir davranış seti tanımlar. Interface, objectlerin nasıl çalışması gerektiğini belirler, ancak nesnelerin nasıl oluşturulacağını belirlemez.