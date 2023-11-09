package SWEA.SWEA.D2;

import java.util.Scanner;

// 368 게임 //

public class D2_1926 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=1; i<=N; i++) {
            String num = String.valueOf(i);
            String result = "";

            for(char c : num.toCharArray()) {
                if( c == '3' ||c == '6'|| c == '9' ) {
                    // 369 가 포함되있다면 문자열을 배열로 만들어(toCharArray()) 하나씩 읽은 후 "-" 를 누적 저장한다.
                    result += "-";
                }
            }

            // 숫자가 369 중 아무것도 아니라면 그냥 num 출력
            if(result.isEmpty()) {
                System.out.print(num+ " ");
            } else {    // 369 가 있다면 reult 출력
                System.out.print(result+ " ");
            }
        } // end for loop

        scanner.close();
    }
}
