import java.util.Scanner;

public class SIAKAD21 {
    public static void main(String[] args) {
        Scanner Linda = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;
            for (int j = 0; j < nilai.length; j++) {
                System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = Linda.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa/3);
        }

        Linda.close();
    }
}
