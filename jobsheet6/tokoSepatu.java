import java.util.Scanner;

/**
 * tokoSepatu
 */
public class tokoSepatu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merek, kategori ;
        int ukuran, harga;

        System.out.print("Masukkan merek sepatu : ");
        merek = sc.nextLine();
        System.out.print("Masukkan kategori sepatu : ");
        kategori = sc.nextLine();
        System.out.print("Masukkan ukuran (36-44): ");
        ukuran = sc.nextInt();

        if (merek.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                harga = 800000;
                System.out.println("Harga sepatu anda : " + harga);
            } else if (kategori.equalsIgnoreCase("High Top")){
                harga = 1200000;
                System.out.println("Harga sepatu anda : " + harga);
            }
        } else if (merek.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                harga = 1000000;
                System.out.println("Harga sepatu anda : " + harga);
            } else if (kategori.equalsIgnoreCase("Man")){
                harga = 1800000;
                System.out.println("Harga sepatu anda : " + harga);
            }
        } else if (merek.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                harga = 750000;
                System.out.println("Harga sepatu anda : " + harga);
            } else if (kategori.equalsIgnoreCase("Adult")){
                harga = 1500000;
                System.out.println("Harga sepatu anda : " + harga);
            }
        } else{
            System.out.println("Maaf sepatu yang anda cari tidak tersedia");
        }

    }

}