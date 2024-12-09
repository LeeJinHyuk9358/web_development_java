package c12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    while 반복문을 돌려서 5번 로또 번호 추출을 가능하게 하는 프로그램을 작성할 예정입니다.

    1-45까지의 숫자를 임의로 생성한 후, lottoNumbers라는 배열에 저장할 것입니다.
        로또 번호 6 ->  index가 6개인 배열 : 게임 한 번
        5개 만들어져야 함. -> 총 5000원치

    중복 제거와 관련된 부분이 걸릴 수 있습니다 -> getter / setter 학습한 부분 확인

    실행 예

    '여기부분에로또로고 출력해주세요'

    로또 번호 추첨기에 오신 것을 환영합니다. 5 게임을 시작합니다. -> '5'는 String이 아닐 것
    이번 로또 당첨 번호는 다음과 같습니다.
    [ 3, 12, 25, 13, 24, 21 ]
    [ 3, 25, 7, 4, 6, 8 ]
    [ 4, 15, 22, 30, 36, 41 ]
    [ 7, 8, 19, 21, 34, 42 ]
    [ 5, 6, 14, 18, 27, 33]

    // ctrl shift f = 쓴 파일들에서 특정 단어 검색
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        // 필요한 객체 생성
        // random.nextInt(a) 의 의미 : 0부터 a-1까지의 int를 임의적으로 생성함.
        Random random = new Random();

        // 필요한 변수 선언
        int[] lottoNumbers = new int[6];
        int count = 5;      // 횟수에 해당하는 count 변수
        boolean duplicate = false;  // duplicate : 중복이라는 의미 // false일 경우에만
                                    // lottoNumbers 배열에 element를 추가하면 되겠죠.

        int number;

        System.out.println("이부분에 로고를 출력할 수 있도록 하세요.");
        String logo = """
                 /$$        /$$$$$$  /$$$$$$$$ /$$$$$$$$ /$$$$$$\s
                | $$       /$$__  $$|__  $$__/|__  $$__//$$__  $$
                | $$      | $$  \\ $$   | $$      | $$  | $$  \\ $$
                | $$      | $$  | $$   | $$      | $$  | $$  | $$
                | $$      | $$  | $$   | $$      | $$  | $$  | $$
                | $$      | $$  | $$   | $$      | $$  | $$  | $$
                | $$$$$$$$|  $$$$$$/   | $$      | $$  |  $$$$$$/
                |________/ \\______/    |__/      |__/   \\______/\s
                                                                \s
                """;
        System.out.println(logo);
        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");
        System.out.println("이번 로또 추천 번호는 다음과 같습니다.");


        lottoNumbers[0] = random.nextInt(45)+1;
        number = random.nextInt(45)+1;
        if(lottoNumbers[0] == number) {
            //같으면 한번 더 random.nextInt()가 있어야겠죠
            for(int i = 0; i < lottoNumbers.length; i++){
            lottoNumbers[i] = (int)(Math.random()*10)+1;
                for(int j = 0; i < lottoNumbers.length; j++){
                    lottoNumbers[j] = (random.nextInt(45)+1);
                }
            }
        }
        lottoNumbers[1] = number; // 이 코드가 실행된다면 lottoNumbers[0] != number 이기 때문
        while (lottoNumbers[0] != number){

        }
        // 오름 차순을 위한 코드
        Arrays.sort(lottoNumbers);
        // 배열 자체 출력을 하는 코드
        System.out.println(Arrays.toString(lottoNumbers));
        for(int i = 0; i < lottoNumbers.length; i++){
            for(int j = 0; j < lottoNumbers.length; j++){

            }
        }


    }
}
