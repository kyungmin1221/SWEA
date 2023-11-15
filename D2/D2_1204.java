package SWEA.SWEA.D2;

// 최빈수 //

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++) {
            int n = Integer.parseInt(bf.readLine());
            int[] student = new int[1000];  // 학생의 수는 1000명

            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int i=0; i< student.length; i++) {
                student[i] = Integer.parseInt(st.nextToken());
            }

            int[] mode = new int[101];  // 각 학생의 점수는 0점 이상 100점 이하의 값
            for(int i=0; i< student.length; i++) {
                mode[student[i]]++;
            }

            int many = 0;  // 최빈수 -> 궁금한 것
            int manyCount = 0; // 최빈수가 나온 횟수

            for(int i=0; i< mode.length; i++) {
                if(manyCount<=mode[i]) {
                    manyCount = mode[i];
                    many = i;
                }
            }
            System.out.println("#"+n+" "+many);
        }
    }
}
