
import java.util.Random;


public class matriz4x4 {
    public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        Random random = new Random();

        // Preenchendo a matriz
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = Math.round((random.nextDouble() * 100.0) * 100.0) / 100.0;
                System.out.printf("%6.2f ", matriz[i][j]);
            }
            System.out.println();
        }

        // Diagonal principal
        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%6.2f ", matriz[i][i]);
        }

        // Diagonal secundária
        System.out.println("\n\nDiagonal Secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%6.2f ", matriz[i][3 - i]);
        }
    }
}
