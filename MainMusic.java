public class MainMusic {
    public static void main(String[] args) {
        System.out.println("----- Music 1 -----");
        Music music1 = new Music();
        music1.tampilkanInfo();

        System.out.println("\n----- Music 2 -----");
        Music music2 = new Music("Hello", "Adele");
        music2.tampilkanInfo();

        System.out.println("\n----- Music 3 -----");
        Music music3 = new Music("Bohemian Rhapsody", "Queen", 354);
        music3.tampilkanInfo();
    }
}
