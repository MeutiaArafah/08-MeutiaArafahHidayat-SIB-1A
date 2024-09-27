import java.util.Scanner;

/**
 * PemilihanBilangan08
 */
public class PemilihanBilangan08 {

    public static void main(String[] args) {

        String hasil;
        int angka = 4;
        // Scanner sc = new Scanner (System.in);

        // System.out.print("Masukkan sebuah angka: ");
        // int angka = sc.nextInt();

        // if (angka % 2 == 0) {
        //     System.out.println("Angka " + angka + " termasuk bilangan genap");
        // } else {
        //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        // }

        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(angka + " termasuk " + hasil);
    }
}