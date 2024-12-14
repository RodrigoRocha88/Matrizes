
public class figuramatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        System.out.println("Triângulo Superior:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
