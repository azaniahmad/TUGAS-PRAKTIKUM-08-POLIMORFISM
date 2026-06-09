public class MainKasting {
    public static void main(String[] args) {
        Produk[] keranjang = {
            new Elektronik("Headphone", 850000, 1),
            new Produk("Tas Ransel", 250000),
            new Elektronik("Smartwatch", 3200000, 2)
        };

        for (Produk item : keranjang) {
            item.tampilDetail();

            if (item instanceof Elektronik) {
                Elektronik el = (Elektronik) item;
                el.cekGaransi();
            }
            System.out.println("----------");
        }
    }
}
