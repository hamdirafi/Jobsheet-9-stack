import java.util.Scanner;

public class DemoSurat01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackSurat01 stackSurat = new StackSurat01(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Stack Surat ===");
            System.out.println("1. Tambah Surat");
            System.out.println("2. Hapus Surat");
            
            System.out.println("3. Lihat Surat di Puncak");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    
                    System.out.print("Masukkan ID Surat: ");
                    String idSurat = scanner.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaMahasiswa = scanner.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Masukkan Jenis Izin (S untuk Sakit, I untuk Izin): ");
                    char jenisIzin = scanner.nextLine().charAt(0);
                    System.out.print("Masukkan Durasi (hari): ");
                    int durasi = scanner.nextInt();
                    scanner.nextLine(); 

                    Surat01 suratBaru = new Surat01(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stackSurat.push(suratBaru);
                    break;

                case 2:
                    
                    Surat01 suratPop = stackSurat.pop();
                    if (suratPop != null) {
                        System.out.println("Surat yang dihapus:");
                        suratPop.tampil();
                    }
                    break;

                case 3:
                    
                    Surat01 suratPeek = stackSurat.peek();
                    if (suratPeek != null) {
                        System.out.println("Surat di puncak stack:");
                        suratPeek.tampil();
                    }
                    break;

                case 4:
                    
                    System.out.print("Masukkan Nama Mahasiswa yang Dicari: ");
                    String namaCari = scanner.nextLine();
                    Surat01 suratCari = stackSurat.cariSurat(namaCari);
                    if (suratCari != null) {
                        System.out.println("Surat ditemukan:");
                        suratCari.tampil();
                    } else {
                        System.out.println("Surat atas nama " + namaCari + " tidak ditemukan.");
                    }
                    break;

                case 5:
                    
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}