import java.util.Arrays;

public class Numbers21 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Pajang baris ke-" + myNumbers[i].length);
        }

    }
}

/*
1. Tambahkan kode program sebagai berikut. Done
2. Apa fungsi dari Arrays.toString()? digunakan untuk mengubah isi array menjadi
   bentuk teks (string) supaya bisa ditampilkan dengan mudah, kalau print
   array langsung tanpa itu, hasilnya cuma alamat memori.
3. Apa nilai default untuk elemen pada array dengan tipe data int? angka 0
4. Tambahkan kode program berikut. Done
5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang 
array dapat dimodifikasi setelah diinstansiasi? tidak bisa.
*/
