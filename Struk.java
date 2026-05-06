public class Struk {

    public void cetak(Kasir kasir) {
        System.out.println("\n=== STRUK PEMBELIAN ===");

        for (Barang b : kasir.daftarBarang) {
            System.out.println(b.nama + " x" + b.jumlah + " = " + b.hitungTotal());
        }

        System.out.println("----------------------");
        System.out.println("Subtotal : " + kasir.subtotal);
        System.out.println("Diskon   : " + kasir.diskon);
        System.out.println("Pajak    : " + kasir.pajak);
        System.out.println("Total    : " + kasir.hitungTotal());
    }
}