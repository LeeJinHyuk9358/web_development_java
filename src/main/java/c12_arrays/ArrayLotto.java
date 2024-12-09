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
public class ArrayLotto {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lottoNumbers = new int[6];
        int count = 5;
        boolean duplicate = false;

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

        while(count > 0){

        // 일단 1 게임을 완성하는 코드
        for (int i = 0; i < lottoNumbers.length; i++){
            // 반복문이 돌 때마다 duplicate = false로 초기화를 시켜야 할 것 같음
            duplicate = false;
            // 배열에 값을 대입하기 전에 임시 변수인 number에 대입 후 중복 확인하고 중복되지 않는다면
            // 이후에 lottoNumbers 배열에 데이터 대입
            number = random.nextInt(45)+1;
            for (int j = 0; j < i ; j++){ // 한계값 j < lottoNumbers.length를 사용하지 않았습니다.
                // 중복을 확인하는 코드
                if(lottoNumbers[j] == number) {
                    duplicate = true;
                    break;
                }
            }

                // 중복이 되지 않으면 if 부분 실행돼서 배열에 값을 대입
                // 중복이 된다면 else 부분이 실행됨 -> 이 경우 다시 한 번 random.nextInt()를 실행해야 하기 때문에
                // i를 하나 감해줬습니다.
                if(!duplicate) {
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
            }
            // 오름 차순을 위한 코드
            Arrays.sort(lottoNumbers);
            // 배열 자체 출력을 하는 코드
            System.out.println(Arrays.toString(lottoNumbers));
            count--;
        }





    }
}
