public class Music {
    private String judul;
    private String artis;
    private int durasi;

    public Music() {
        this.judul = "Unknown";
        this.artis = "Unknown";
        this.durasi = 0;
    }

    public Music(String judul, String artis) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = 0;
    }

    public Music(String judul, String artis, int durasi) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }

    public void tampilkanInfo() {
        System.out.println("Judul   : " + judul);
        System.out.println("Artis   : " + artis);
        System.out.println("Durasi  : " + durasi + " detik");
    }
}
