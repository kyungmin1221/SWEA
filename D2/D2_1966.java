package SWEA.SWEA.D2;

// 숫자 정렬 //

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D2_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++) {
            int N = Integer.parseInt(bf.readLine());
            int[] A = new int[N];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int i=0; i<N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
//            Arrays.sort(A);
//            System.out.print("#"+t+" ");
//            for(int x : A) {
//                System.out.print(x+ " ");
//            }
//            System.out.println();

            for(int i=0; i<N-1; i++) {    // 0-4
                for(int j=0; j<N-i-1; j++) {    // 0-
                    if(A[j]>A[j+1]) {
                        int temp = A[j];
                        A[j] = A[j+1];
                        A[j+1] = temp;
                    }
                }
            }
            System.out.print("#"+t+" ");
            for(int x : A) {
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
}
