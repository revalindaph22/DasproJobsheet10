import java.util.Scanner;

public class BioskopWithScanner21 {

    public static void main(String[] args) {
        Scanner Linda = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int baris, kolom;

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = Linda.nextInt();
            Linda.nextLine();

        if (menu == 1) {
            while (true) {  
                System.out.print("Masukkan nama : ");
                String nama = Linda.nextLine();
                System.out.print("Masukkan baris : ");
                baris = Linda.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom = Linda.nextInt();
                Linda.nextLine();

            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                System.out.println("Maaf, nomor kursi tidak tersedia! (baris 1-4, kolom 1-2)");
                System.out.println("Silakan masukkan lagi, baris dan kolom anda.\n");
                continue;
            }
                
                penonton[baris-1][kolom-1] = nama;
                
                System.out.print("Input penonton lainnya? (y/n): ");
                String next = Linda.nextLine();
                
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }

        }

        else if (menu == 2) {
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.print("***\t");
                     } else {
                        System.out.print(penonton[i][j] + "\t");
                    }
                }
            System.out.println();
            }
        } else if (menu == 3) {
            System.out.println("Keluar dari program...");
            break;
        } else {
            System.out.println("Menu tidak tersedia!");
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
   Done
3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang 
   tidak tersedia. Done
4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang 
   dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan 
   baris dan kolom kembali. Done
5. Pada menu 2, jika kursi kosong, ganti null dengan ***. Done
 */