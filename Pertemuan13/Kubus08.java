import java.util.Scanner;
public class Kubus08 {
    
    // Fungsi  menghitung volume kubus
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi  menghitung luas permukaan kubus
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Sisi Kubus: " + sisi);
        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);

    }
}

