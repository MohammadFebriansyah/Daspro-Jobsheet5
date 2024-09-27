package Praktikum05;
import java.util.Scanner;
public class Siakad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, nilaiHuruf, kelas, kualifikasi;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai Ujian: ");
        nilaiUjian = sc.nextDouble();
    
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        if (nilaiAkhir >= 80 && nilaiAkhir <=100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            kualifikasi = "baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            kualifikasi = "cukup";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            kualifikasi = "kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }



        System.out.println(String.format("Mahasiswa dengan nama %s (NIM %s) kelas %s absen %s ", nama, nim, kelas, absen));
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
    
}
