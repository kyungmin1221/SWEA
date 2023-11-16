package SWEA.SWEA.D2;

// 수도 요금 경쟁 //

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int P = Integer.parseInt(st.nextToken());   // A 사의 1리터당 요금
            int Q = Integer.parseInt(st.nextToken());   // B 사의 기본 요금
            int R = Integer.parseInt(st.nextToken());   // B 사의 월간 사용량 제한
            int S = Integer.parseInt(st.nextToken());   // B 사의 R 리터 이상일 경우 추가 요금
            int W = Integer.parseInt(st.nextToken());   // 한 달간 사용하는 수도의 양

            int add = W-R;  // B 사의 추가 요금  = 150

            int Afactory = P * W;   // 90
            int Bfactory = Q;       // 100
            if(W<R) {
                Bfactory = Q;
            } else {                // 추가 요금을 내야히는 경우
                Bfactory = Bfactory + (add*S);  //
            }

            if(Afactory<Bfactory) {
                System.out.println("#"+t+" "+Afactory);
            } else {
                System.out.println("#"+t+" "+Bfactory);
            }

        } // end t for loop
    }
}
