class MatrixSubtraction {
    public static void main(String[] args) {
        
        int[][] m1 = {
                {10, 20},
                {30, 40}
        };

        int[][] m2 = {
                {1, 2},
                {3, 4}
        };

        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }

        System.out.println("Resultant Matrix after Subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}