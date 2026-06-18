package bagian2.bacatulis;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class HitungHari {
    public static void main(String[] args) {

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            int jumlahBaris = 0;
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Jumlah baris di hari.txt: " + jumlahBaris);
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}