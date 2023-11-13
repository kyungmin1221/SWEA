package SWEA.SWEA.D2;

// 어디에 단어가 들어갈까 //

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D2_1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken());   // 세로 길이
            int K = Integer.parseInt(st.nextToken());   // 단어 길이
            int[][] puzzle = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < N; j++) {
                    puzzle[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int answer = 0;

            // 가로 확인
            for (int i = 0; i < N; i++) {
                int temp = 0;
                for (int j = 0; j < N; j++) {
                    if (puzzle[i][j] == 0) { // 0 이면
                        // 뒤에 더 볼게 없으므로 일단 K 와 같아졌는지 확인
                        if (temp == K) {
                            // 같다면 들어갈 수 있는 곳
                            answer++;
                        }
                        // 0이 나왔는데 "temp == K" 를 만족하지 못했다면 단어가 들어가지 못하는곳
                        // temp를 다시 초기화 해줘야함
                        temp = 0;
                    }
                    else { // 1 이면
                        temp++;
                    }
                }
                if(temp == K) answer++;
            }

            // 세로 확인
            for (int i = 0; i < N; i++) {
                int temp = 0;
                for (int j = 0; j < N; j++) {
                    if (puzzle[j][i] == 0) { // 0 이면
                        // 뒤에 더 볼게 없으므로 일단 K 와 같아졌는지 확인
                        if (temp == K) {
                            // 같다면 들어갈 수 있는 곳
                            answer++;
                        }
                        // 0이 나왔는데 "temp == K" 를 만족하지 못했다면 단어가 들어가지 못하는곳
                        // temp를 다시 초기화 해줘야함
                        temp = 0;
                    }
                    else { // 1 이면
                        temp++;
                    }
                }
                if(temp == K) answer++;
            }
            System.out.println("#"+t+" "+answer);
        } // end t for loop
    }
}
