package SWEA.SWEA.D2;

import java.io.IOException;
import java.util.Scanner;

// 달팽이 숫자 //

public class D2_1954 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            int snail[][] = new int[N][N];
            int dx[] = { -1,0,1,0};
            int dy[] = { 0,1,0,-1 };	 //우,하,좌,상
            int count = 1;
            int x = 0, y = 0;
            int d = 0;
            while (count <= N * N) {
                snail[x][y] = count++;
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (nx < 0 || nx >= N || ny < 0 || ny >= N || snail[nx][ny] != 0) {
                    //경계 벗어나거나, 숫자가 이미 존재하면
                    d = (d + 1) % 4;  //방향바꿈
                    nx = x + dx[d];
                    ny = y + dy[d];
                }
                x = nx;
                y = ny;
            }
            System.out.println("#"+t);
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    System.out.print(snail[i][j]+" ");
                }
                System.out.println();
            }

        }
    }

}
