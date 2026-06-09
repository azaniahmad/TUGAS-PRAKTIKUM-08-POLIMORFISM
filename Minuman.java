public class Minuman extends MenuItem {
    private boolean isIce;

    public Minuman(String nama, double harga, boolean isIce) {
        super(nama, harga);
        this.isIce = isIce;
    }

    @Override
    public double hitungTotal() {
        return harga + (isIce ? 2000 : 0);
    }

    @Override
    public void tampilStruk() {
        super.tampilStruk();
        System.out.println("Jenis   : " + (isIce ? "Ice" : "Hot"));
    }

    public boolean isIce() {
        return isIce;
    }
}
