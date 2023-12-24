public class Main {
    public static void main(String[] args) {

        // Bir bina oluşturdum ve tüm daireleri bu binada oluşturacağım.
        Bina bina1 = new Bina("Yenişehir Caddesi Turanlar Sokağı",4);

        //İlk daireyi oluşturdum.
        Daire daire1 = new Daire(bina1.adres, 1,13);
        //İlk ev sahibi oluşturdum.
        EvSahibi evSahibi1 = new EvSahibi(bina1.adres, daire1.getDaireNo(),"Mehmet","Demir");
        //İlk kiracıyı oluşturdum.
        Kiraci kiraci1 = new Kiraci(bina1.adres, daire1.getDaireNo(), "Arzu","Çiçek");

        daire1.displayInfo();//daire1'in bilgilerini görüntüleyen metodu çağırdım.
        bina1.displayInfo();//bina1'in bilgilerini görüntüleyen metodu çağırdım.
        evSahibi1.displayInfo();//evSahibi1'in bilgilerini görüntüleyen metodu çağırdım.
        evSahibi1.addApartment(daire1);//addApartment() metodunu çağırarak evSahibi1 ev sahibine bu daireyi eklemesini sağladım.
        kiraci1.displayInfo();//kiraci1'in bilgilerini görüntüleyen metodu çağırdım.
        System.out.println("\n\n");

        //Binaya ait diğer daireleri, onların ev sahipleri ve kiracılarını tanımladım.
        // Eğer bir ev sahibine birden fazla ev eklenirse onu yazacak.

        Daire daire2= new Daire(bina1.adres, 2,13);
        EvSahibi evSahibi2 = new EvSahibi(bina1.adres, daire2.getDaireNo(),"Kemal","Kılınç");
        Kiraci kiraci2 = new Kiraci(bina1.adres, daire2.getDaireNo(), "Cihan","Soykan");

        daire2.displayInfo();
        bina1.displayInfo();
        evSahibi2.displayInfo();
        evSahibi2.addApartment(daire2);
        kiraci2.displayInfo();
        System.out.println("\n\n");


        Daire daire3 = new Daire(bina1.adres, 3,13);
        EvSahibi evSahibi3 = new EvSahibi(bina1.adres, daire3.getDaireNo(), evSahibi1.getFirstName(), evSahibi1.getLastName());
        Kiraci kiraci3 = new Kiraci(bina1.adres, daire3.getDaireNo(), "Suna","Parlak");

        daire3.displayInfo();
        bina1.displayInfo();
        evSahibi1.displayInfo();
        evSahibi1.addApartment(daire3); // Burada evSahibi1'e 1 tane daha ev ekletince o ev sahibinin sahip olduğu tüm evlerini gösterecek.
        kiraci3.displayInfo();
        System.out.println("\n\n");


        Daire daire4 = new Daire(bina1.adres, 4,13);
        EvSahibi evSahibi4 = new EvSahibi(bina1.adres, daire4.getDaireNo(),"Metin","Pusu");
        Kiraci kiraci4 = new Kiraci(bina1.adres, daire4.getDaireNo(), "Can","Kaya");
        daire4.displayInfo();
        bina1.displayInfo();
        evSahibi4.displayInfo();
        evSahibi4.addApartment(daire4);
        kiraci4.displayInfo();

    }
}