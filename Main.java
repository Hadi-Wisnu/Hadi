public class Main {
    public static void main(String[] args) {

        Kasir kasir = new Kasir();


        kasir.tambahBarang(new Barang("Indomie", 3000, 4));
        kasir.tambahBarang(new Barang("Telur", 2500, 2));
        kasir.tambahBarang(new Barang("Susu", 15000, 1));
        kasir.tambahBarang(new Barang("Roti", 10000, 3));


        kasir.hitungSubtotal();
        kasir.hitungDiskon();
        kasir.hitungPajak();

    
        Struk struk = new Struk();
        struk.cetak(kasir);

        
        Bayar bayar = new Bayar(100000);
        bayar.hitungKembalian(kasir.hitungTotal());
        bayar.tampilkan();
    }
}