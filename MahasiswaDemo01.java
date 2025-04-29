import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;

        StackTugasMahasiswa01 stack = new StackTugasMahasiswa01(5);

        do {
            System.out.println("\n=== Menu Stack Tugas Mahasiswa ===");
            System.out.println("1. Tambah Tugas Mahasiswa");
            System.out.println("2. Nilai Tugas (Pop)");
            System.out.println("3. Lihat Tugas Teratas (Peek)");
            System.out.println("4. Tampilkan Semua Tugas");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    if (!stack.isFull()) {
                        System.out.print("Masukkan NIM:");
                        String nim = scan.nextLine();
                        System.out.print("Masukkan Nama:");
                        String nama = scan.nextLine();
                        System.out.print("Masukkan Kelas:");
                        String kelas = scan.nextLine();

                        Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas);
                        stack.push(mhs);
                    } else {
                        System.out.println("Stack sudah penuh!");
                    }
                    break;
                case 2:
                    Mahasiswa01 tugasDinilai = stack.pop();
                    if (tugasDinilai != null) {
                        System.out.print("Masukkan Nilai: ");
                        int nilai = scan.nextInt();
                        tugasDinilai.tugasDInilai(nilai);
                        System.out.println("Tugas berhasil dinilai:");
                        tugasDinilai.tampil();
                    }
                    break;
                case 3:
                    Mahasiswa01 atas =stack.peek();
                    if (atas != null) {
                        System.out.println("Tugas di atas:");
                        atas.tampil();
                    }
                    break;
                case 4:
                    stack.print();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }while (pilih != 5);
    }
}
