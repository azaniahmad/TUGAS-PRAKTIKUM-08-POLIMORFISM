public class MainKasir {
    public static void main(String[] args) {
        MenuItem[] pesanan = {
            new Makanan("Burger Ayam", 25000, "M"),
            new Minuman("Teh Manis", 8000, true),
            new Makanan("Kentang Goreng", 18000, "L"),
            new Minuman("Kopi Susu", 15000, false),
            new Paket("Paket Hemat", 50000, 3),
            new Makanan("Nasi Goreng", 22000, "S"),
            new Paket("Paket Keluarga", 85000, 4)
        };

        double subtotal = 0;

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println("========================================");
            System.out.println("ITEM KE-" + (i + 1));
            System.out.println("========================================");
            pesanan[i].tampilStruk();
            subtotal += pesanan[i].hitungTotal();

            if (pesanan[i] instanceof Makanan) {
                Makanan m = (Makanan) pesanan[i];
                System.out.println("[Info] Ukuran " + m.getUkuran()
                    + " - Faktor harga : "
                    + (m.getUkuran().equals("S") ? "1.0"
                       : m.getUkuran().equals("M") ? "1.3" : "1.6"));
            } else if (pesanan[i] instanceof Minuman) {
                Minuman mn = (Minuman) pesanan[i];
                System.out.println("[Info] Tambahan ice : Rp "
                    + (mn.isIce() ? "2.000" : "0"));
            } else if (pesanan[i] instanceof Paket) {
                Paket pk = (Paket) pesanan[i];
                System.out.println("[Info] Jumlah item : " + pk.getJumlahItem()
                    + (pk.getJumlahItem() >= 3 ? " (diskon 15%)" : ""));
            }

            System.out.println();
        }

        double pajak = MenuItem.hitungPajak(subtotal);
        double totalBayar = subtotal + pajak;

        System.out.println("========================================");
        System.out.println("              RINGKASAN                 ");
        System.out.println("========================================");
        System.out.println("Subtotal : Rp " + String.format("%,.0f", subtotal));
        System.out.println("PPN 11%  : Rp " + String.format("%,.0f", pajak));
        System.out.println("TOTAL    : Rp " + String.format("%,.0f", totalBayar));
        System.out.println("========================================");
    }
}
