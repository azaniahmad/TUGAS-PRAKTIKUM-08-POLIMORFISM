public class Paket extends MenuItem {
    private int jumlahItem;

    public Paket(String nama, double harga, int jumlahItem) {
        super(nama, harga);
        this.jumlahItem = jumlahItem;
    }

    @Override
    public double hitungTotal() {
        if (jumlahItem >= 3) {
            return harga * 0.85;
        }
        return harga;
    }

    @Override
    public void tampilStruk() {
        super.tampilStruk();
        System.out.println("Jumlah Item : " + jumlahItem);
        if (jumlahItem >= 3) {
            System.out.println("Diskon  : 15%");
        }
    }

    public int getJumlahItem() {
        return jumlahItem;
    }
}
