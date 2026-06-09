public class MainUpCasting {
    public static void main(String[] args) {
        Produk p = new Elektronik("Laptop", 12000000, 2);

        p.tampilDetail();

        System.out.println();

        // p.cekGaransi(); // error: method tidak ada di Produk
    }
}
