import java.util.Scanner;

public class Kafe08 {
    public static void main(String[] args) {

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan keangggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }
        
        double totalHarga = hargaMenu * jumlah; // hitung total harga

        // update total harga berdasarkan cup yang dipilih
        switch (ukuranCup) {
            case 'S':
                break;
                case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
                case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
                default:
                System.out.println("Size yang dipilih tidak tersedia");
                break;
        }

        double diskon = keanggotaan ? 0.1 :0; // menentukan nilai diskon berdasarkan status keanggotaan
        double nominalBayar = totalHarga - (diskon * totalHarga); // hitung nominal bayar

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);

    }

}