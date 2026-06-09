public class Pembayaran {
    protected double nominal;

    public Pembayaran(double nominal) {
        this.nominal = nominal;
    }

    public void prosesBayar() {
        System.out.println("Memproses pembayaran Rp " + nominal);
    }

    public String getMetode() {
        return "Pembayaran Umum";
    }
}
