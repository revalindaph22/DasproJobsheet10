import java.util.Scanner;

public class BioskopWithScanner {

    public static void main(String[] args) {
        Scanner Linda = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int baris, kolom;

        while (true) {
            System.out.print("Masukkan nama : ");
            String nama = Linda.nextLine();
            System.out.print("Masukkan baris : ");
            baris = Linda.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = Linda.nextInt();
            Linda.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            String next = Linda.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }

        }

        Linda.close();

    }
}

/*
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai 
   dari indeks ke-0? Jelaskan! 
   = tidak wajib, yang penting indeks nya valid dan masih dalam batas array.
2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut: - - - 
   Menu 1: Input data penonton 
   Menu 2: Tampilkan daftar penonton 
   Menu 3: Exit 
3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang 
   tidak tersedia 
4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang 
   dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan 
   baris dan kolom kembali  
5. Pada menu 2, jika kursi kosong, ganti null dengan ***
 */