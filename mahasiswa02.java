import java.util.Scanner;
public class mahasiswa02 {
    
    Scanner input = new Scanner(System.in);
    String nama, nim, Kelas;
    double ipk;
    
    void tampilkanInformasi() {
        System.out.println("\nNama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + Kelas);
        System.out.println("IPK: " + ipk);
    }
    
    void ubahKelas(String kelasBaru) {
        Kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.5) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
    
    public static void main(String[] args) {
        mahasiswa02 mhs = new mahasiswa02();
        
        mhs.nama = "Budi";
        mhs.nim = "123456";
        mhs.Kelas = "IF-1A";
        mhs.ipk = 3.5;
        
        mhs.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs.nilaiKinerja());
        mhs.ubahKelas("IF-1B");
        mhs.updateIPK(3.8);
        mhs.tampilkanInformasi();
        
    }
}
        

     