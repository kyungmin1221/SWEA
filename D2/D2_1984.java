package SWEA.SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 중간 평균값 구하기 //


public class D2_1984 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int test = 1;
        for(int t=0; t<T; t++) {
            int[] A = new int[10];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int i=0; i<A.length; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            for(int j=0; j<A.length-1; j++) {
                for(int k=0; k<A.length-1-j; k++) {
                    if(A[k]>A[k+1]) {
                        int temp = A[k];
                        A[k] = A[k+1];
                        A[k+1] = temp;

                    }
                }
            }
            double result =0.0;
            int num = A.length -2;
            for(double x  : A) {
                result += x;
            }
            result = result - A[0] - A[9];
            int answer =(int)Math.round(result/num);
            System.out.println("#"+ test+" "+answer);

            test ++;
	}	// end T for loop


    }
}
