import java.util.Scanner;

public class Tugas21Array2 {
    public static void main(String[] args) {
        Scanner Linda = new Scanner(System.in);
        int JmlResponden = 10;
        int JmlPertanyaan = 6;

        int[][] NilaiSurvey = new int[JmlResponden][JmlPertanyaan];

        System.out.println("\n=== Input Nilai Survei (1 - 5) ===");
        for (int c = 0; c < JmlResponden; c++) {
            System.out.println("Responden " + (c + 1) + ":");
            for (int j = 0; j < JmlPertanyaan; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + ": ");
                NilaiSurvey[c][j] = Linda.nextInt();
            }
        }

        System.out.println("\n====================================\n");

        System.out.println("Rata-rata tiap responden:");
        for (int v = 0; v < JmlResponden; v++) {
            int TotalNilaiPeresponden = 0;
            for (int r = 0; r < JmlPertanyaan; r++) {
                TotalNilaiPeresponden += NilaiSurvey[v][r];
            }
            double RataPeresponden = (double) TotalNilaiPeresponden / JmlPertanyaan;
            System.out.printf("Responden %d: %.2f%n", (v + 1), RataPeresponden);
        }

        System.out.println("\n----------------------------------\n");

        System.out.println("Rata-rata tiap pertanyaan:");
        for (int t = 0; t < JmlPertanyaan; t++) {
            int TotalNilaiSemua = 0;
            for (int s = 0; s < JmlResponden; s++) {
                TotalNilaiSemua += NilaiSurvey[s][t];
            }
            double RataPertanyaan = (double) TotalNilaiSemua / JmlResponden;
            System.out.printf("Pertanyaan %d: %.2f%n", (t + 1), RataPertanyaan);
        }

        System.out.println("\n----------------------------------\n");

        int TotalSemuanya = 0;
        for (int k = 0; k < JmlResponden; k++) {
            for (int l = 0; l < JmlPertanyaan; l++) {
                TotalSemuanya += NilaiSurvey[k][l];
            }
        }

        double RataSemuanya = 
            (double) TotalSemuanya / (JmlResponden * JmlPertanyaan);

        System.out.printf("Rata-rata keseluruhan: %.2f%n", RataSemuanya);

        Linda.close();
    }
}
