package SWEA.SWEA.D2;

// 시작 덧셈 //


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int hour = Integer.parseInt(st.nextToken());
            int minute = Integer.parseInt(st.nextToken());
            int hour2 = Integer.parseInt(st.nextToken());
            int minute2 = Integer.parseInt(st.nextToken());

            int hourSum = hour + hour2;
            int minuteSum = minute + minute2;

            if(minuteSum>59) {
                minuteSum = minuteSum-60;
                hourSum ++;
            }
            if(hourSum>12) {
                hourSum = hourSum - 12;
            }
            System.out.println("#"+t+" "+hourSum+" "+minuteSum);
        }

    }
}
