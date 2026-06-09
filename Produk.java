public class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilDetail() {
        System.out.println("Produk  : " + nama);
        System.out.println("Harga   : Rp " + harga);
    }
}
