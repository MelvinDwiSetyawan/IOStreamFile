// Nama : Melvin Dwi Setyawan
// NPM  : 2410010550
package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // Array String berukuran tetap untuk daftar kategori
        String[] kategori = {"Elektronik", "Makanan", "Pakaian"};

        System.out.println("== Daftar Kategori ==");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println();

        // Membuat objek Gudang dan mengisi minimal 5 barang
        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Kabel HDMI", 35000, 20));
        gudang.tambahBarang(new Barang("Mie Instan", 3500, 100));
        gudang.tambahBarang(new Barang("Kaos Polos", 45000, 30));
        gudang.tambahBarang(new Barang("Charger HP", 50000, 15));
        gudang.tambahBarang(new Barang("Kopi Sachet", 2000, 200));

        gudang.tampilkanSemua();
        System.out.println("Total nilai persediaan: Rp" + gudang.totalNilai());
        gudang.simpanKeBerkas();

        System.out.println();

        // Objek Gudang baru untuk membuktikan data tersimpan di berkas
        Gudang gudangLain = new Gudang("barang.txt");
        gudangLain.muatDariBerkas();
        gudangLain.tampilkanSemua();
        System.out.println("Jumlah barang: " + gudangLain.jumlahBarang());
        System.out.println("Total nilai persediaan: Rp" + gudangLain.totalNilai());
    }
}