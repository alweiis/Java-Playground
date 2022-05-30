package DS;

import java.util.Arrays;

public class CreateMatrix {
    public static void main(String[] args) {
        int[][] output1 = solution(new int[][]{
                {0, 3, 0},
                {0, 2, 0},
                {1, 3, 0},
                {2, 1, 0},
        });
        System.out.println(Arrays.deepToString(output1));

        int[][] output2 = solution(new int[][]{
                {0, 2, 0},
                {2, 4, 1},
                {1, 3, 1},
                {2, 1, 0},
        });
        System.out.println(Arrays.deepToString(output2));
    }

    public static int[][] solution(int[][] edges) {
        int vertex = 0;
        for (int[] edge: edges) {
            vertex = Math.max(vertex, edge[0]);
            vertex = Math.max(vertex, edge[1]);
        }
        int[][] answer = new int[vertex+1][vertex+1];
        for (int[] edge: edges) {
            if (edge[2] == 0) {
                answer[edge[0]][edge[1]] = 1;
            } else if (edge[2] == 1) {
                answer[edge[0]][edge[1]] = 1;
                answer[edge[1]][edge[0]] = 1;
            }
        }
        return answer;
    }
}
