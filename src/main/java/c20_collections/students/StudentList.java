package c20_collections.students;

import java.util.ArrayList;
import java.util.List;

/*
    student 패키지 생성
    Student.java
    StudentList.java 클래스 생성
 */
public class StudentList {
    public static void main(String[] args) {

        // 비어있는 List 선언
        List<Student> students = new ArrayList<>();
       

        // 20240001 강미경
        // 20240002 강준석
        // 20240003 김은수
        // 20240004 박경호
        // 20240005 박수빈
        // 을 추가하세요.

        // 추가후에 전체 리스트를 출력하세요.
//        Student student1 = new Student(2024001,"강미경");
//        Student student2 = new Student(2024002,"강준석");
//        Student student3 = new Student(2024003,"김은수");
//        Student student4 = new Student(2024004,"박경호");
//        Student student5 = new Student(2024005,"박수빈");
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//        students.add(student5);
        students.add(new Student(20240001,"강미경"));
        students.add(new Student(20240002,"강준석"));
        students.add(new Student(20240003,"김은수"));
        students.add(new Student(20240004,"박경호"));
        students.add(new Student(20240005,"박수빈"));

//        System.out.println(student1);
        System.out.println(students.get(0));
        students.get(0).setName("김일");
        System.out.println(students.get(0).getName());
        System.out.println(students);
        
        
    }
}
