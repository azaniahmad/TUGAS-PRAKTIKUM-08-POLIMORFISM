public class MenuItem {
    protected String nama;
    protected double harga;

    public MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double hitungTotal() {
        return harga;
    }

    public void tampilStruk() {
        System.out.println("Menu    : " + nama);
        System.out.println("Harga   : Rp " + String.format("%,.0f", harga));
        System.out.println("Total   : Rp " + String.format("%,.0f", hitungTotal()));
    }

    public static double hitungPajak(double total) {
        return total * 0.11;
    }
}
