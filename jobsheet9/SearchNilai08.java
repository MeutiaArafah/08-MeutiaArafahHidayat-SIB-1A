import java.util.Scanner;

public class SearchNilai08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int[] arrNilai;
        // int hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int nilai = sc.nextInt();
        int arrNilai[] = new int[nilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin di cari: ");
        int key = sc.nextInt();
        int hasil  = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        if ( hasil != -1) {
            System.out.println();
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
            System.out.println();
        } else{
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
            System.out.println();
        }
       
       

    }
}