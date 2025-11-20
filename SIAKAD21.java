import java.util.Scanner;

public class SIAKAD21 {
    public static void main(String[] args) {
        Scanner Linda = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa: ");
        int jumlahSiswa = Linda.nextInt();

        System.out.println("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = Linda.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = Linda.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke- " + (i+1) + totalPersiswa/jumlahMatkul);
        }

        System.out.println("\n======================================");
        System.out.println("Rata-rataa Nilai setiap Mata Kuliah:");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/jumlahSiswa);
        }

        Linda.close();
    }
}
