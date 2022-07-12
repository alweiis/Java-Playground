package Daily;

import java.util.*;

public class RobotPath {
    public static void main(String[] args) {
        int[][] room = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}
        };
        int[] src = new int[]{4, 2};
        int[] dst = new int[]{2, 2};
        int output = solution(room, src, dst);
        System.out.println(output); // --> 8
    }

    public static int solution(int[][] room, int[] src, int[] dst) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(src);
        int x = src[0];
        int y = src[1];
        room[x][y] = 1;

        while (!queue.isEmpty()) {
            int[] location = queue.poll();
            x = location[0];
            y = location[1];
            for (int i=0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || ny < 0 || nx >= room.length || ny >= room[0].length)    continue;
                if (room[nx][ny] != 0)  continue;
                room[nx][ny] = room[x][y] + 1;
                queue.add(new int[]{nx, ny});
            }
        }
        x = dst[0];
        y = dst[1];
        return room[x][y] - 1;
    }
}
