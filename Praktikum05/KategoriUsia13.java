package Praktikum05;
import java.util.Scanner;
public class KategoriUsia13 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Usia anda: ");

if (scanner.hasNextInt()) {
int usia = scanner.nextInt();
if (usia >= 0) {
if (usia <= 12) {
System.out.println("Kategori Usia anda: Anak");
} else if (usia <= 19) {
System.out.println("Kategori Usia anda: Remaja");
} else if (usia <= 64) {
System.out.println("Kategori Usia anda: Dewasa");
} else {
System.out.println("Kategori Usia anda: Lansia");
}
} else {
System.out.println("Input tidak valid. Usia harus berupa angka positif.");
}
} else {
System.out.println("Input tidak valid. Harap masukkan angka.");
}
}   
}
