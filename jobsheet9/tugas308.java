import java.util.Scanner;

public class tugas308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("Berikut adalah daftar menu makanan & minuman: ");
        // memunculkan nama menu
        for(int i = 0; i < menu.length; i++){
            System.out.println((i+1) + ". " + menu[i]);
        }

        // inputan makanan/minuman yang dicari
        System.out.print("Masukkan nama makanan/minuman yang dicari: ");
        String cariMenu = sc.nextLine();
        int hasil = -1;

        for(int i = 0; i < menu.length; i++){
            if (cariMenu.equalsIgnoreCase(menu[i])) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Menu '" + cariMenu + "' tersedia di menu. Terletak di nomor " + (hasil+1) + " pada daftar menu" );
        }
        else{
            System.out.println("Menu '" + cariMenu + "' tidak tersedia di menu.");
        }

    }
}