package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class Sementara {
    public static void main(String[] args) {
        File berkas = new File("sementara.txt");

        try {
            berkas.createNewFile();
            System.out.println("Sebelum dihapus — Berkas ada: " + berkas.exists());

            berkas.delete();
            System.out.println("Sesudah dihapus  — Berkas ada: " + berkas.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}