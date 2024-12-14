
import java.util.Random;


public class matriz5x5 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random random = new Random();
        int somaImpares = 0;
        int[] somaColunas = new int[5];
        int[] somaLinhas = new int[5];
        
        // Preenchendo a matriz e calculando as somas
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatórios entre 0 e 99
                System.out.printf("%3d ", matriz[i][j]);

                // Soma dos ímpares
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }

                // Soma das colunas e linhas
                somaColunas[j] += matriz[i][j];
                somaLinhas[i] += matriz[i][j];
            }
            System.out.println();
        }

        // Exibindo resultados
        System.out.println("\nSoma dos números ímpares: " + somaImpares);

        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
        }
    }
}

