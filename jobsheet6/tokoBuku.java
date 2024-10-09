import java.util.Scanner;

/**
 * tokoBuku
 */
public class tokoBuku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double diskon, totalDiskon;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                totalDiskon = diskon + 0.02;
                System.out.println("Total diskon anda : " + totalDiskon + "%");
            } else {
                System.out.println("Total diskon anda : " + diskon + "%");
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                totalDiskon = diskon + 0.02;
                System.out.println("Total diskon anda : " + totalDiskon + "%");
            } else {
                totalDiskon = diskon + 0.01;
                System.out.println("Total diskon anda : " + totalDiskon + "%");
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
                System.out.println("Total diskon anda : " + diskon + "%");
            } else {
                System.out.println("Maaf anda tidak mendapatkan diskon");
            }
        }
        {

        }
    }
}