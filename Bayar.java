public class Bayar {
    int bayar;
    double kembalian;

    public Bayar(int bayar) {
        this.bayar = bayar;
    }

    public void hitungKembalian(double total) {
        kembalian = bayar - total;
    }

    public void tampilkan() {
        System.out.println("Bayar    : " + bayar);
        System.out.println("Kembali  : " + kembalian);
    }
}