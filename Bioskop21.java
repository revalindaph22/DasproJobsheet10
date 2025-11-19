public class Bioskop21 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana"; // modif no.3

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        // mondif no.6
        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        // modif no.9
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
        }

        /*
        Pertanyaan
        1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
           = tidak harus, bisa di isi dari mana saja tidak harus dari 0 karena array hanya butuh indeks yang valid, 
           bukan urutan pengisian.
        2. Mengapa terdapat null pada daftar nama penonton? 
           = karena array 2D di isi dengan indeks baris 4 dan kolom 2, namun input hanya berhenti pada baris 3 kolom 0,
           dan jika di hitung hanya terdapat 3 kolom 1 pada coding, itu kurang pengisian lagi pada kolom 1 baris ke 3
        3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut. Done
        4. Tambahkan kode program sebagai berikut: Jelaskan  fungsi dari penonton.length dan penonton[0].length! 
           Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
           = penonton.length, menunjukkan jumlah baris pada array 2 dimensi, misalnya ada 4 baris, maka int penonton = 4.
             penonton[0].length, menunjukkan jumlah kolom dalam baris ke-, jadi kalau baris pertama punya 2 penonton,
             maka penonton[0].length = 2.
             ya, semuanya sama, nilainya 2, karena setiap baris berisi 2 orang penonton, jadi kolomnya sama semua,
             kalau ada satu baris yang jumlah kolomnya beda, baru nilainya berbeda.
        5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop.
           Compile, run, lalu amati hasilnya. Done
        6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop.
           Compile, run, lalu amati hasilnya. Done
        7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop.
           Compile, run, lalu amati hasilnya. Done
        8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop.
           Compile, run, lalu lakukan amati hasilnya. Done
        9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk
           setiap baris. Compile dan run program kemudian amati hasilnya. Done
        10. Menurut anda, apa kekurangan dan kelebihan foreach loop dengan for lop?
        Kelebihan foreach, lebih mudah di terapkan, tidak perlu memikirkan indeks (i), dan membuat kode lebih rapi.
        Kekurangan foreach, tidak bisa mengakses indeks langsung, tidak cocok jika ingin mengubah isi array, 
        dan tidak bisa dari indeks tertentu (harus dari awal sampai akhir).
        11. Berapa indeks baris maksimal untuk array penonton? 4 baris
        12. Berapa indeks kolom maksimal untuk array penonton? 2 kolom
        13. Apa fungsi dari String.join()? menggabungkan beberapa string menjadi satu string,
            dan setiap elemen dipisahkan oleh pemisah yang ditentukan.
        */
    }
}
