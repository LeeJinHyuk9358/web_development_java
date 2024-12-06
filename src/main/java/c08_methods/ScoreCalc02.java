package c08_methods;

import java.util.Scanner;

public class ScoreCalc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        int totalSubjects = 1;
        double score1 = 0;
        double score2;
        double totalScore = 0;
        double avgScore = 0;
        boolean endOfCalc = false;

        while (!endOfCalc) {
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            if (score1 == -1) {
                break;
            }
            totalScore = scoreCalculator.calculateSum2(totalScore, score1);

            // 평균 계산 및 출력
            avgScore = scoreCalculator.calculateAvg(totalScore, totalSubjects);
            System.out.println("-------- 최종으로 한 번만 나오는 합계와 평균입니다 --------");
            System.out.println("입력한 점수의 합계 : " + totalScore + "\n입력한 점수의 평균 : " + avgScore);
            totalSubjects++;
        }

    }
}
