
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class matriz3x5 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        Random random = new Random();
        Set<Integer> elementos = new HashSet<>();
        boolean repetidos = false;
        int pares = 0, impares = 0;

        // Preenchendo a matriz
        System.out.println("Matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(50);
                System.out.printf("%3d ", matriz[i][j]);

                // Verificando repetidos
                if (!elementos.add(matriz[i][j])) {
                    repetidos = true;
                }

                // Contando pares e ímpares
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println();
        }

        // Resultados
        System.out.println("\nPossui elementos repetidos? " + (repetidos ? "Sim" : "Não"));
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }

}
