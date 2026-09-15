import java.util.Scanner;

public class SIAKAD27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        System.out.print("Masukkan kelas: ");
        String kelas = sc.nextLine();

        System.out.print("Masukkan nomor absen: ");
        int nomorAbsen = sc.nextInt();

        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = sc.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = sc.nextDouble();

        // Bobot: kuis 30%, tugas 40%, ujian 30%
        double nilaiAkhir = (nilaiKuis * 0.3) + (nilaiTugas * 0.4) + (nilaiUjian * 0.3);

        String nilaiHuruf;
        String nilaiSetara;
        String kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = "4";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = "3,5";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = "3";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = "2,5";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = "2";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = "1";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = "0";
            kualifikasi = "Gagal";
        }

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + nomorAbsen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
    }
}