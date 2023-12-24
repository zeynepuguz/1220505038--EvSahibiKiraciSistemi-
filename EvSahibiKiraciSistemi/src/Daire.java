public class Daire extends Konut implements Comparable<Daire>{
    // compareTo() metodunu kullanabilmek için tanımlı olan Comporable interface'ini implemente ettim.
    private int apartmanNo;
    private int daireNo;

    public Daire(String adres, int daireNo, int apartmanNo ) {
        // Daire sınıfının constructor'ı
        // Parametre olarak adres, daire numarası ve apartman numarasını alır.
        super(adres);// üst sınıf değişkenleri
        this.apartmanNo=apartmanNo;
        this.daireNo=daireNo;
    }


    @Override
    public int compareTo(Daire daire) {// Bu metod, iki daire objesini karşılaştırarak sıralama yapar.
        if (this.apartmanNo == daire.apartmanNo) {
            return Integer.compare(this.getDaireNo(), daire.getDaireNo());
        }
        return Integer.compare(this.apartmanNo, daire.apartmanNo);
    }

    @Override
    public void displayInfo() { // Daire sınıfının bilgilerini ekrana yazdıran metod
        super.displayInfo();
        System.out.println("Adres : " + adres );
        System.out.println("Apartman No : " + getApartmanNo() + " Daire No : " + getDaireNo());
    }

    public int getApartmanNo() {
        return apartmanNo;
    }

    public int getDaireNo() {
        return daireNo;
    }
}


