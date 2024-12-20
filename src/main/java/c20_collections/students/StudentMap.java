package c20_collections.students;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        
        // Map 선언
        Map<Integer, String> studentMap = new HashMap<>();
        
        /*
            데이터를 입력하세요.
            20240001 김일
            20240002 김이
            20240003 김삼
            20240005 김오
            20240006 김육
         */
        studentMap.put(20240001,"김일");
        studentMap.put(20240002,"김이");
        studentMap.put(20240003,"김삼");
        studentMap.put(20240005,"김오");
        studentMap.put(20240006,"김육");
        
        // studentMap을 출력하세요
        System.out.println("map 전체 출력 : " + studentMap);
        
        // studentMap의 key 값들을 Set으로 받아오세요.
        Set<Integer> keySet = studentMap.keySet();
        System.out.println(keySet);

        // keySet의 모든 요소들을 keyList로 옮기세요.
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(keySet);
        System.out.println(keyList);


        // 각 키의 value들을 콘솔에 출력하세요
        /*
            실행 예
            김일
            김이
            김삼
            김오
            김육
         */
        Collection<String> values = studentMap.values();
        System.out.println("value 들 : " + values);
    }
}
