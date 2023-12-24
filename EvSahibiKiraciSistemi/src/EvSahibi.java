import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class EvSahibi extends Bina{

    private String firstName;
    private String lastName;
    private List<Daire> daireList;  // Ev sahibinin sahip olduğu daireleri tutan listeyi tanımladım.

    public EvSahibi(String adres, int katSayisi, String firstName, String lastName) { // EvSahibi contructor'ı
        super(adres, katSayisi); // üst sınıf değişkenleri
        this.firstName = firstName; // bu sınıftaki değişkenleri this ile çağırdım.
        this.lastName = lastName;
        this.daireList = new ArrayList<>();
    }

    @Override
    public void displayInfo() { // Ev sahibinin bilgilerini görüntüleyen metod
        System.out.println("Ev Sahibi Bilgileri:");
        System.out.println("Ad Soyad : " + this.getFirstName() + " " + this.getLastName());
    }

    // addApartment metodu, ev sahibinin sahip olduğu daire listesine yeni bir daire eklemek için kullanılır.
    public void addApartment(Daire daire){
        daireList.add(daire); // daire listesine add metoduyla daire eklettim.
        Collections.sort(daireList); // Daireleri daire numarasına göre sıralayan metodu tanımladım.
        displayApartment(); // Yeni daire eklenen durumu ekrana yazdırmak için displayApartment metodunu çağırdım.
    }

    // displayApartment metodu, ev sahibinin sahip olduğu daireleri ekrana yazdırmak için kullanılır.
    private void displayApartment(){
        for (Daire daire : daireList)
            System.out.println(getFirstName() + " " + getLastName() + " ev Sahibine " + daire.getDaireNo() + " numaralı daire eklendi. ");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Daire> getDaireList() {
        return daireList;
    }
}
