package Daily;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int K = 3;

        int[][] rotatedMatrix = solution(matrix, K);
        System.out.println(Arrays.deepToString(rotatedMatrix));
    }

    public static int[][] solution(int[][] matrix, int K) {
        if (matrix == null)	return null;

        int n = matrix.length;
        int m = matrix[0].length;
        int rotateNum = K % 4;

        if (rotateNum == 0) return matrix;

        int[][] array = rotateNum % 2 == 1 ? new int[m][n] : new int[n][m];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (rotateNum == 1) {
                    array[row][col] = matrix[n-1-col][row];
                } else if (rotateNum == 2) {
                    array[row][col] = matrix[n-1-row][m-1-col];
                } else {
                    array[row][col] = matrix[col][m-1-row];
                }
            }
        }

        return array;
    }
}
