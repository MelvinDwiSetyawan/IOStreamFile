package bagian3.kontak;

public class Kontak {
    private String nama;
    private String nomor;
    private String email;

    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() {
        return email;
    }

    // Mengubah objek menjadi satu baris teks untuk disimpan ke berkas
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Mengembalikan keterangan kontak dalam bentuk teks
    public String info() {
        return nama + " - " + nomor + " - " + email;
    }
}