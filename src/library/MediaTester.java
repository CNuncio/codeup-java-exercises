package library;

public class MediaTester {
    public static void main(String[] args) {
    Media book = new Books();
        book.touch();
        book.checkout();
    Media cd = new CDs();
        cd.touch();
        cd.checkout();
    Media dvd = new DVDs();
        dvd.touch();
        dvd.checkout();
    }
}
