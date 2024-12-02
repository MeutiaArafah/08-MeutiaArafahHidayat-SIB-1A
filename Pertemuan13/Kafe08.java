import java.util.Scanner;

public class Kafe08 {
    // kalo ada void gabisa langsung di sout, harus dipanggil di void main
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat Anda mendapat diskon sebesar 50% !");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Selamat Anda mendapat diskon sebesar 30% !");
        } else {
            System.out.println("Kode invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("======================================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static double hitungTotalHarga(int[][] pesan, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 220000, 12000, 10000, 180000 };

        double diskon;
        switch (kodePromo.toUpperCase()) { // untuk mengubah semua huruf menjadi besar
            case "DISKON50":
                diskon = 0.5;
                break;
            case "DISKON30":
                diskon = 0.3;
                break;
            default:
                diskon = 0;
                break;
        }

        double hargaTotal = 0;
        for(int i = 0; i < pesan.length; i++){
            int nomorMenu = pesan[i][0];
            int jumlahItem = pesan[i][1];
            hargaTotal += hargaItems[nomorMenu - 1] * jumlahItem;
        }
        hargaTotal = hargaTotal - (hargaTotal * diskon);
        return hargaTotal;
    }

    public static int[][] pesanMenu(Scanner sc, int jmlMenu) {
       int[][] pesan = new int[jmlMenu][2]; // => kolom nya 2 fkarena berisi 2 kolom (nama menu, banyaknya menu itu)

        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("\nMasukkan nomor menu ke-" + (i+1) + " : ");
            pesan[i][0] = sc.nextInt();
            System.out.print("Masukkan jumlah item menu ke:" + (i+1) + " : ");
            pesan[i][1] = sc.nextInt();

        }
        System.out.println("======================================");
        System.out.println("Daftar menu yang dipilih: ");
        for (int i = 0; i< jmlMenu; i++) {
            System.out.println("Menu ke-" + (i + 1) + " : " + pesan[i][0] + " sebanyak " + pesan[i][1]);
        }
        return pesan;
    }

    public static void main(String[] args) {
        Menu("t", true, "diskon30");
        Scanner sc = new Scanner(System.in);

        // mengambil banyaknya menu yang ingin dipesan
        System.out.print("Masukkan banyak jenis menu yang akan dipesan: ");
        int jmlMenu = sc.nextInt();
        // pesanMenu(sc, jmlMenu);

        // System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        // int banyakItem = sc.nextInt();
        
        int[][] pesan = pesanMenu(sc, jmlMenu);
        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        double totalHarga = hitungTotalHarga(pesan, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp " +  totalHarga);

    }
}