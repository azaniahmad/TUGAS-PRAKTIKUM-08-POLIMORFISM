public class TransferBank extends Pembayaran {
    private String namaBank;

    public TransferBank(double nominal, String namaBank) {
        super(nominal);
        this.namaBank = namaBank;
    }

    @Override
    public void prosesBayar() {
        System.out.println("[" + namaBank + "] Transfer Rp " + nominal + " via rekening Bank");
    }

    @Override
    public String getMetode() {
        return "Transfer " + namaBank;
    }
}
