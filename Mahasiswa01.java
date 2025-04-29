public class Mahasiswa01 {
    String nim ;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa01() {
        this.nilai = -1;
    }

    public Mahasiswa01(String nim, String nama, String Kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    public void tugasDInilai(int nilai) {
        this.nilai = nilai;
    }

    public void tampil() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Nilai : " + (nilai == -1 ? "Belum dinilai" : nilai));
    }
}