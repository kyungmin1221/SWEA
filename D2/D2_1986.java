package SWEA.SWEA.D2;


// 지그재그 숫자 //

import java.util.Scanner;

public class D2_1986 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int T = scanner.nextInt();

        int test = 1;
        for(int t=0; t<T; t++) {

            int N = scanner.nextInt();
            int[] A = new int[N+1];
            int result =0;

            for(int i=1; i<=N; i++) {
                A[i] = i;
            }

            for(int x : A) {
                if(x%2 == 1) {
                    result = result + x;
                } else {
                    result = result - x;
                }
            }
            System.out.println("#"+test+" "+ result);
            test++;
        }
    }
}
