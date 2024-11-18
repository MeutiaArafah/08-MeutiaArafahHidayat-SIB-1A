import java.util.Scanner;

public class tugas108 {
    public static void main(String[] args) {
        // mengelola nilai mahasiswa
        Scanner sc = new Scanner (System.in);

        // memasukkan banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int nilaiMhs[] = new int [jumlahMhs];
        int total = 0;
        int rata2 = 0;
        int terendah = 100; int tertinggi = 0;
        

        // memasukkan setiap nilai mahasiswa
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke- "+ (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            } else if (nilaiMhs[i] < terendah){
                terendah = nilaiMhs[i];
            }
        }

        // menjumlahkan nilai mahasiswa
        for(int i = 0; i < nilaiMhs.length; i ++){
             total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata rata seluruh mahasiswa: " + rata2); // menghitung rata rata
        System.out.println("Nilai tertinggi mahasiswa: "+ tertinggi); // menampilkan nilai tertinggi
        System.out.println("Nilai terendah mahasiswa: "+ terendah); // menampilkan nilai terendah
        System.out.println("----------------------------------------");

        // menampilkan semua nilai yang telah dimasukkan.
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah " + nilaiMhs[i]);
        }
    }
}