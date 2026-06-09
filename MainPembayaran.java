public class MainPembayaran {
    public static void main(String[] args) {
        Pembayaran[] transaksi = {
            new GoPay(75000),
            new TransferBank(50000, "BCA"),
            new QRIS(25000)
        };

        for (Pembayaran p : transaksi) {
            p.prosesBayar();
            System.out.println("Metode : " + p.getMetode());
            System.out.println();
        }
    }
}
