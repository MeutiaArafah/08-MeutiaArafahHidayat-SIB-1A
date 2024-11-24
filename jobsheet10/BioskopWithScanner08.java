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
            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                penonton[baris - 1][kolom - 1] = nama;
            } else if (menu == 2) {
                for(int b = 0; b < penonton.length; b++){
                    for(int k = 0; k < penonton[b].length; k++ ){
                        if (penonton[b][k] != null) {
                            System.out.println("Baris: "+ (b+1) + " Kolom: "+ (k+1) + " : " + penonton[b][k]);
                        }
                    }
                }
               
            } else if (menu == 3) {
                    break;
                
            }
        }
    }
}