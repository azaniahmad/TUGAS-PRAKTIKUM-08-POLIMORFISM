public class ContohDynamicBinding {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();
        Hewan h3 = new Burung();
        Hewan h4 = new Ikan();

        h1.suara();
        h2.suara();
        h3.suara();
        h4.suara();
    }
}
