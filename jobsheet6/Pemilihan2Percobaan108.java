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
            if ((tahun % 100) != 0) { // pengecualian 1, tidak habis dibagi 100
                System.out.println("Tahun Kabisat");
            } else if((tahun % 400) == 0) { // pengecualian 2, meskipun habis dibagi 100
                System.out.println("Tahun ini Kabisat");
            } 
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
        
    }
}