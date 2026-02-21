import java.util.Scanner;

public class mahasiswaKonstruktor {
     Scanner input = new Scanner(System.in);
    String nama, nim, Kelas;
    double ipk;
    
    // Konstruktor tanpa parameter
    public mahasiswaKonstruktor() {
    }
    
    // Konstruktor dengan parameter
    public mahasiswaKonstruktor(String nama, String nim, double ipk, String klas) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.Kelas = klas;
    }
    
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
        mahasiswaKonstruktor mhs1 = new mahasiswaKonstruktor();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.Kelas = "SI 2J";
        mhs1.ipk = 3.55;
        
        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja());
        mhs1.ubahKelas("SI 2H");
        mhs1.updateIPK(3.69);
        mhs1.tampilkanInformasi();
        
        // Object dengan konstruktor berparameter
        mahasiswaKonstruktor mhs2 = new mahasiswaKonstruktor("Annisa Nabila", "2141720160", 3.35, "TI 2I");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();
    }
}
        

     

