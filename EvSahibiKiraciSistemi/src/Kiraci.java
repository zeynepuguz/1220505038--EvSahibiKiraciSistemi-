public class Kiraci extends EvSahibi{

    public Kiraci(String adres, int katSayisi, String firstName, String lastName) { // Kiraci sınıfının contructor'ı
        super(adres, katSayisi, firstName, lastName); // üst sınıf değişkenleri
    }

    @Override
    public void displayInfo() { // Kiracı bilgilerini EvSahibi sınıfında displayInfo metodu üzerinden görüntüleyen metod
        System.out.println("Kiracı Bilgileri:");
        System.out.println("Ad Soyad : " + this.getFirstName() + " " + this.getLastName());

    }
}
