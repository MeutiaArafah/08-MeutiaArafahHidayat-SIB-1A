import java.util.Scanner;

public class tugasRekrusif {

    static int fungsiRekursif(int jumAngka, Scanner sc){
        if(jumAngka == 0){
            return (0);
        } else{
            System.out.print("Masukkan angka ke-" + jumAngka + ": ");
            int angka = sc.nextInt();
            return (angka + fungsiRekursif(jumAngka - 1, sc));
        }
    }
    
    static int fungsiIteratif(int jumAngka, Scanner sc){
        
        int total = 0;
        for(int i = jumAngka; i > 0; i--){
            System.out.print("Masukkan angka ke-" + (i) + ": ");
            int angka = sc.nextInt();
            total += angka;
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int jumAngka = sc.nextInt(); 
        
        System.out.println("Total total dari fungsi Rekursif " + jumAngka + " angka yang dimasukkan adalah: " + fungsiIteratif(jumAngka, sc));
        System.out.println("Total total dari fungsi Iteratif " + jumAngka + " angka yang dimasukkan adalah: " + fungsiRekursif(jumAngka, sc));
    }
}