public class GoPay extends Pembayaran {

    public GoPay(double nominal) {
        super(nominal);
    }

    @Override
    public void prosesBayar() {
        System.out.println("[GoPay] Membayar Rp " + nominal + " via dompet digital");
    }

    @Override
    public String getMetode() {
        return "GoPay";
    }
}
