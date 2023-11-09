package SWEA.D2;

// 파리퇴치 //

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_2001 {

    // 원본 배열
    static int[][] map;

    // 누적합을 저장하기 위한 배열
    static int[][] sumMap;
    static int T,N,M;
    static int solution(int[][] map,int m) {


        // 누적합을 저장해 놓기 위한 배열에 저장
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                sumMap[i][j] = map[i-1][j-1] + sumMap[i-1][j] + sumMap[i][j-1] - sumMap[i-1][j-1];

            }
        }
        int maxSum = Integer.MIN_VALUE;

        for(int i=M; i<=N; i++) {
            for(int j=M; j<=N; j++) {
                int sum = sumMap[i][j] - sumMap[i][j-M] - sumMap[i-M][j] + sumMap[i-M][j-M];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스
        T = Integer.parseInt(bf.readLine());
        int testCase = 1;
        while (testCase <= T) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            // n x n 배열
            N = Integer.parseInt(st.nextToken());
            // m x m 배열 => 파리를 잡을 배열
            M = Integer.parseInt(st.nextToken());
            map = new int[N][N];
            sumMap = new int[N + 1][N + 1];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.println("#"+testCase+ " "+ solution(map, M));
            testCase ++;
        }
    }
}
