public class Bina extends Konut{
    private int katSayisi; // katSayisi değişkeni oluşturdum.

    public Bina(String adres, int katSayisi) { //Bina sınıfının contructor'ını oluşturdum.
        super(adres); // üst sınıf değişkenini super'la çağırdım.
        this.katSayisi = katSayisi;
    }

    @Override
    public void displayInfo() { //Bina bilgilerini görüntüleyen metot
        System.out.println("Kat Sayısı : " + getKatSayisi());
    }

    public int getKatSayisi() {
        return katSayisi;
    }

}
