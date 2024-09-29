import java.util.Scanner;

public class PemilihanHariDenganIf08 {
    public static void main(String[] args) {
        
        int bilangan;
        String tipeBilangan;

        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan bilangan bulat: ");
        bilangan = sc.nextInt();

        switch (bilangan) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                tipeBilangan = "Weekday";
                break;
            case 6:
            case 7:
                tipeBilangan = "Weekend";
                break;
            default:
                tipeBilangan = "Invalid Number";
        }
        System.out.println(bilangan + " adalah " + tipeBilangan);
    }
}