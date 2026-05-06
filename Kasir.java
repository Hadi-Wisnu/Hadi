import java.util.ArrayList;

public class Kasir {
    ArrayList<Barang> daftarBarang = new ArrayList<>();
    int subtotal = 0;
    double diskon = 0;
    double pajak = 0;

    public void tambahBarang(Barang b) {
        daftarBarang.add(b);
    }

    public void hitungSubtotal() {
        for (Barang b : daftarBarang) {
            subtotal += b.hitungTotal();
        }
    }

    public void hitungDiskon() {
        if (subtotal > 100000) {
            diskon = subtotal * 0.1;
        }
    }

    public void hitungPajak() {
        pajak = (subtotal - diskon) * 0.1;
    }

    public double hitungTotal() {
        return subtotal - diskon + pajak;
    }
}