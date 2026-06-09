public class MainDownCasting {
    public static void main(String[] args) {
        Produk p = new Elektronik("Laptop", 12000000, 2);

        if (p instanceof Elektronik) {
            Elektronik e = (Elektronik) p;
            e.tampilDetail();
            e.cekGaransi();
        }
    }
}
