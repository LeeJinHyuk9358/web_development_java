package c07_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            기본 예제
            n에 숫자를 입력받아 몇 번 반복할지 정하고, 1부터 n까지 더하는 반복문을 작성하시오

            실행 예
            몇 번 반복할지 입력하세요 >>> 100
            합은 5050입니다.
         */
        Scanner scanner = new Scanner(System.in);
        // 변수 선언 및 초기화
        int n = 0;
        int result = 0;
        System.out.print("몇 번 반복할지 입력하세요 >>> ");
        n = scanner.nextInt();
        for(int i = 0; i < n+1; i++){
            result = result + i;
        }
        System.out.println("합은 " + result + "입니다.");

//        int result1 = 0;
//        int result2 = 0;
//        int result3 = 0;
//        // 1번풀이
//        for(int i = 0 ; i < n; i++){
//            result1 = i + 1;
//        }
//        // 2번풀이
//        for(int i = 0; i < n+1 ; i++){
//            result += i;
//        }
//        // 3번 풀이
//        for(int i = 0; i <= n ; i++){
//            result3 += i;
//        }
    }
}
