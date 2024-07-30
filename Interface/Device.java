package Interface;

// interface'ler constructor içeremez ve instance variable tanımlayamazlar.
// interface-de variable-ler ancag public, static ve final ola biler (Source: Youtube) protected ve private ola bilmezler
// bir class bir nece interface-i implement ede biler

public interface Device {
    // private String model; Mumkun deyil (protected, public fergi yoxdur)

    void displayInfo();

    // static or default islederek body-li method yaza bilerik ve override olmasa da olar
    static void displayInfo2(){};
    default void displayInfo3(){};

}

// Neden Interface'lerde Constructor ve Instance Variable Yok?
// Interface Amacı: Interface'ler, farklı sınıflar için ortak bir davranış seti tanımlar. Interface, objectlerin nasıl çalışması gerektiğini belirler, ancak nesnelerin nasıl oluşturulacağını belirlemez.