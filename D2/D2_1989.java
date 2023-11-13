package SWEA.SWEA.D2;

import java.util.Scanner;

public class D2_1989 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int test = 1;
        //int flag = 1;   // for 문안에서 flag 변수가 1로 초기화가 안됨
        for(int t=0; t<T; t++) {
            String s = scanner.next();
            char[] c = s.toCharArray();
            int flag = 1;

            for(int i=0; i<s.length()/2; i++) {
                if(c[i]==c[s.length()-1-i]) {
                    continue;
                } else {
                    flag =0;
                    break;
                }
            }
            if(flag ==1) {
                System.out.println("#"+test+" "+"1");
            } else {
                System.out.println("#"+test+" "+"0");
            }
            test ++;
        }
    }
}
