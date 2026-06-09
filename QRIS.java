public class QRIS extends Pembayaran {

    public QRIS(double nominal) {
        super(nominal);
    }

    @Override
    public void prosesBayar() {
        System.out.println("[QRIS] Scan barcode - membayar Rp " + nominal);
    }

    @Override
    public String getMetode() {
        return "QRIS";
    }
}
