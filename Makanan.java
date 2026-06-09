public class Makanan extends MenuItem {
    private String ukuran;

    public Makanan(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    @Override
    public double hitungTotal() {
        double faktor = 1.0;
        switch (ukuran) {
            case "S": faktor = 1.0; break;
            case "M": faktor = 1.3; break;
            case "L": faktor = 1.6; break;
        }
        return harga * faktor;
    }

    @Override
    public void tampilStruk() {
        super.tampilStruk();
        System.out.println("Ukuran  : " + ukuran);
    }

    public String getUkuran() {
        return ukuran;
    }
}
