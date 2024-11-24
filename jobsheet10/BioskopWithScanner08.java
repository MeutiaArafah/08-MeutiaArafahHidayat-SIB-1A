import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu = 0;
        String nama, next;

        String[][] penonton = new String[4][2];

        System.out.println("======== Daftar Menu ========");
        System.out.println("- Menu 1 : Input data penonton");
        System.out.println("- Menu 2 : Tampilkan daftar penonton");
        System.out.println("- Menu 3 : Exit");
        System.out.println();

        while (true) {
            System.out.print("Silahkan pilih daftar menu: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:

                    System.out.print("Masukkan nama: ");
                    sc.nextLine();
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    
                    if (baris > 4 || kolom > 2) {
                        System.out.println("Kursi tidak tersedia! Silahkan input ulang baris dan kolom");
                        break;
                    }
                    if(penonton[baris - 1][kolom - 1] != null){
                        System.out.println("Maaf kursi ini sudah terisi! Silakan input ulang baris dan kolom");
                        break;
                    }
                    
                    penonton[baris - 1][kolom - 1] = nama;
                    break;
                    
                case 2:
                    for (int b = 0; b < penonton.length; b++) {
                        for (int k = 0; k < penonton[b].length; k++) {
                            if (penonton[b][k] != null) {
                                System.out.println(
                                        "- " + penonton[b][k] + " (baris: " + (b + 1) + " kolom: " + (k + 1) + ")");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Selesai");
                    break;
            }
            if (menu == 3) {
                break;
            }
            System.out.println();
        }
    }
}