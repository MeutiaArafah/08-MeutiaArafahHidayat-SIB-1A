import java.util.Scanner;

/**
 * Pemilihan2Percobaan208
 */
public class Pemilihan2Percobaan208 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);

        int pilihan_menu, harga;
        String member;
        double diskon, total_bayar;

        // menampilkan menu
        System.out.println("_________________________");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("_________________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("_____________________________________");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input08.nextInt();
        input08.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input08.nextLine();
        System.out.println("_____________________________________");

        // struktur kondisi pertama -> pembeli memiliki member
        if (member.equalsIgnoreCase("y")) { // menggunakan equalsIgnoreCase untuk membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // menghentikan eksekusi lebih lanjut jika pilihan salah
            }

            // menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }

        // struktur kondisi kedua -> pembeli TIDAK memiliki member
        else if(member.equalsIgnoreCase("n")){
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // menghitung total bayar 
            System.out.println("Total bayar = " + harga);
            

        } else{
            System.out.println("Member tidak valid");
        }
        System.out.println("_____________________________________");
    }
}