import java.util.Scanner;

/**
 * Pemilihan2Percobaan108
 */
public class Pemilihan2Percobaan108 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);

        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = input08.nextInt();

        if ((tahun % 4 ) == 0) {
            if ((tahun % 100) != 0) 
                System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}