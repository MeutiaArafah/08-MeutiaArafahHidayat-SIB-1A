import java.util.Scanner;

public class tugas208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesan = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jmlPesan];
        int[] harga = new int[jmlPesan];
        int totalHarga = 0;

        for(int i = 0; i < pesanan.length; i++){
            System.out.print("Masukkan nama makanan/minuman ke-" + (i+1) + " : ");
            pesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga: Rp ");
            harga[i] = sc.nextInt();
            totalHarga += harga[i];
            sc.nextLine();
        }

        System.out.println("------ DAFTAR PESANAN ------");
        for(int i = 0; i < pesanan.length; i++){
            System.out.println("Pesanan ke-" + (i+1) + " : " + pesanan[i] + " Rp " + harga[i]);
        }
        System.out.println("Total harga: Rp " + totalHarga);
        
    }
}
