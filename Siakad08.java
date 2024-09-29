import java.util.Scanner;
/**
 * Siakad08
 */
public class Siakad08 {

    public static void main(String[] args) {
        String nama, nim, nilaiHuruf = "", kualifikasi =""; // mendeklarasikan variabel nama, nim, prastudi dengan tipe data string
        char kelas; // mendeklarasikan variabel kelas dengan tipe data char
        byte absen; // mendeklarasikan variabel absen dengan tipe data byte
        double nilaiKuis, nilaiTugas, nilaiAkhir, nilaiUTS, nilaiUAS, nilaiUjian, bobotKuis = 0.2, bobotTugas = 0.15,
        bobotUTS = 0.3, bobotUAS = 0.35; /** mendeklarasikan variabel nilaiKuis, nilaiTugas, nilaiAkhir, nilaiUTS, nilaiUAS, bobotTugas, 
        bobotUTS, bobotUAS dengan tipe data boolean */

        Scanner sc = new Scanner(System.in); // instansiasi scanner

        System.out.print("Masukkan nama: "); // memunculkan output bertuliskan Masukkan nama
        nama = sc.nextLine(); // menginputkan variabel nama dengan inputan dari scanner 
        System.out.print("Masukkan NIM: "); // memunculkan output bertuliskan Masukkan NIM
        nim = sc.nextLine(); // menginputkan variabel nim dengan inputan dari scanner

        
        System.out.print("Masukkan kelas: "); //memunculkan output bertuliskan Masukkan kelas
        kelas = sc.nextLine().charAt(0); // menginputkan variabel kelas dengan inputan dari scanner
        System.out.print("Masukkan nomor absen: "); // memunculkan output bertuliskan Masukkan nomor absen
        absen = sc.nextByte(); // menginputkan variabel absen dengan inputan dari scanner

        System.out.print("Masukkan nilai kuis: "); // memunculkan output bertuliskan Masukkan nilai kuis
        nilaiKuis = sc.nextDouble(); // menginputkan variabel nilaiKuis dengan inputan dari scanner
        System.out.print("Masukkan nilai tugas: "); // memunculkan output bertuliskan Masukkan nilai tugas
        nilaiTugas = sc.nextDouble(); // menginputkan variabel nilaiTugas dengan inputan dari scanner
        System.out.print("Masukkan nilai UTS: "); // memunculkan output bertuliskan Masukkan nilai UTS
        nilaiUTS = sc.nextDouble(); // menginputkan variabel nilaiUTS dengan inputan dari scanner
        System.out.print("Masukkan nilai UAS: "); // memunculkan output bertuliskan Masukkan UAS
        nilaiUAS = sc.nextDouble(); // menginputkan variabel nilaiUAS dengan inputan dari scanner
        
        nilaiUjian = (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS);
        System.out.println("Total nilai ujian: " + nilaiUjian);
        nilaiAkhir = ((nilaiKuis * bobotKuis) + (nilaiTugas * bobotTugas) + nilaiUjian); // melakukan proses penghitungan nilai akhir

        if (nilaiAkhir > 80)  {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        }else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        }else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.print("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")"); // memampilkan data hasil inputan yang telah diisi melalui scanner
        System.out.println( " Kelas " + kelas + " nomor absen " + absen); // memampilkan data hasil inputan yang telah diisi melalui scanner
        System.out.println("Nilai Akhir : " + nilaiAkhir); // memampilkan data hasil inputan yang telah diisi melalui scanner
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}