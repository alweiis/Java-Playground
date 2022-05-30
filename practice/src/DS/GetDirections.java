package DS;

import java.util.*;

public class GetDirections {

    public static void main(String[] args) {
        boolean result1 = solution(new int[][]
                        {
                            {0, 1, 0, 0},
                            {0, 0, 1, 0},
                            {0, 0, 0, 1},
                            {0, 1, 0, 0}
                        },
                0,
                2
        );
        System.out.println(result1);

        boolean result2 = solution(new int[][]
                        {
                                {0, 1, 0, 0, 0},
                                {0, 0, 0, 1, 0},
                                {0, 1, 0, 0, 0},
                                {0, 1, 1, 0, 0},
                                {1, 1, 1, 1, 0}
                        },
                1,
                4
        );
        System.out.println(result2);
    }

    public static boolean solution(int[][] matrix, int from, int to) {
        // 정점의 방문 정보를 기록하기 위한 1차원 배열 생성
        boolean[] d = new boolean[matrix.length];
        // 연결리스트를 사용하여 큐 생성
        Queue<Integer> q = new LinkedList<>();

        // 첫 시작점으로 from 할당
        q.offer(from);
        // 첫 정점의 방문 여부를 표시
        d[from] = true;

        while (!q.isEmpty()) {
            int now = q.poll();
            // 큐에서 꺼낸 정점이 to와 같다면 true를 반환
            if (now == to)  return true;
            for (int next = 0; next < matrix[now].length; next++) {
                if (matrix[now][next] == 1 && !d[next]) {
                    // 다음 정점으로 가기 위해 큐에 정점을 추가
                    q.offer(next);
                    // 방문한 정점을 표시
                    d[next] = true;
                }
            }
        }
        // 정점 from과 to가 연결되어 있지 않다면 false를 반환
        return false;
    }
}