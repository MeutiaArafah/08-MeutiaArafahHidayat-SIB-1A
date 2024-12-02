public class PengunjungCafe08 {

    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar Nama Pengunjung:");
        for(int i = 0; i < namaPengunjung.length; i++){
            System.out.println("- " + namaPengunjung[i]);

        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}

// belum di push, benerin percobaan 3 dulu
//for (String p : namaPengunjung) {
//     System.out.println("- " + namaPengunjung);
            
// }