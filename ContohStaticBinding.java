public class ContohStaticBinding {
    public static void main(String[] args) {
        Kendaraan k = new Motor();

        Kendaraan.infoJenis();
        Motor.infoJenis();

        System.out.println();

        k.klakson();
    }
}
