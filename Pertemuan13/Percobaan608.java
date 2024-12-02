import java.util.Scanner;

public class Percobaan608 {

    public static void main(String[] args) {
        // program tanpa menggunakan fungsi
        // Scanner input = new Scanner(System.in);

        // int p, l, t, L, vol;

        // System.out.println("Masukkan panjang");
        // p = input.nextInt();
        // System.out.println("Masukkan lebar");
        // l = input.nextInt();
        // System.out.println("Masukkan tinggi");
        // t = input.nextInt();

        // L = p * l;
        // System.out.println("Luas Persegi panjang adalah " + L);

        // vol = p * l * t;
        // System.out.println("Volume balok adalah " + vol);
        
         // ====================================================================
         // output menggunakan fungsi
         Scanner input = new Scanner (System.in);

         int p, l, t, L, vol;
         System.out.println("Masukkan panjang");
         p = input.nextInt();
         System.out.println("Masukkan lebar");
         l = input.nextInt();
         System.out.println("Masukkan tinggi");
         t = input.nextInt();

         L = hitungLuas(p, l);
         System.out.println("Luas Persegi Panjang adalah " + L);
         vol = hitungVolume(t, p, l);
         System.out.println("Volume Balok adalah " + vol);
    }
    
    // ====================================================================
    // program menggunakan fungsi
    // fungsi hitungLuas
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }

    // fungsi hitungVolume
    static int hitungVolume (int tinggi, int a , int b){
        int volume = hitungLuas(a,b) * tinggi;
        return volume;
    }
}