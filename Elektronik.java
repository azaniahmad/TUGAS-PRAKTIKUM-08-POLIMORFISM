public class Elektronik extends Produk {
    private int garansiTahun;

    public Elektronik(String nama, double harga, int garansiTahun) {
        super(nama, harga);
        this.garansiTahun = garansiTahun;
    }

    @Override
    public void tampilDetail() {
        super.tampilDetail();
        System.out.println("Garansi : " + garansiTahun + " tahun");
    }

    public void cekGaransi() {
        System.out.println("Garansi masih berlaku " + garansiTahun + " tahun");
    }
}
