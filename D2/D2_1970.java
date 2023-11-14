package SWEA.SWEA.D2;

// 쉬운 거스름돈 //

import java.util.Scanner;

public class D2_1970 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T =scanner.nextInt();   // 테케입력
        int[] A = {50000,10000,5000,1000,500,100,50,10};
        for(int t=1; t<=T; t++) {
            int N =scanner.nextInt();
            int[] result = new int[8];

//            for(int i=0; i<A.length; i++) {
//                int num = N / A[i];
//                N = N % A[i];
//                result[i] = num;
//            }

            for(int i=0; i<A.length; i++) {
                int num = N / A[i];
                int other = N % A[i];
                if(num != 0) {
                    result[i] = num;
                }
                N = other;
            }

            System.out.println("#"+t);
            for(int x : result) {
                System.out.print(x+ " ");
            }
            System.out.println();   // 이거 안해줘서 틀렸었음
        } // end t for loop

    }
}
