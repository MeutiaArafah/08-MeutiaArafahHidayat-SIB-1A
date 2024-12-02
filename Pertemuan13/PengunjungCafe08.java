public class PengunjungCafe08 {

    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar Nama Pengunjung:");
        for (String p : namaPengunjung) {
            System.out.println("- " + p);
                    
        }
    }

    public static void main(String[] args) {
       daftarPengunjung("Ali", "Budi", "Citra");
    }
}

