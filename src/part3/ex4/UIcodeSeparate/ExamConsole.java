package part3.ex4.UIcodeSeparate;

import java.util.Scanner;

public class ExamConsole {

    private  ExamList list = new ExamList();
    void inputList () {
        //instance method 방법 with this
        Scanner scan = new Scanner(System.in);
        System.out.println("성적을 입력해주시기 바랍니다.");
        int kor, eng, math;

        do {
            System.out.printf("Kor :");
            kor = scan.nextInt();

            if (kor < 0 || 100 < kor)
                System.out.printf("kor is worng");

        } while (kor < 0 || 100 < kor);

        do {
            System.out.printf("eng : ");
            eng = scan.nextInt();
            if (eng < 0 || 100 < eng)
                System.out.printf("eng : wrong");
        } while (eng < 0 || 100 < eng);


        do {
            System.out.printf("math : ");
            math = scan.nextInt();
            if (math < 0 || 100 <math)
                System.out.printf("math : wrong");
        } while (math < 0 || 100 < math);


        Exam exam = new Exam(kor,eng,math);

//            Exam exam = new Exam();
//            exam.setKor(kor);
//            exam.setEng(eng);
//            exam.setMath(math);
// -----------------add------------------------------
        list.add(exam);
    }

    void printList() {
        this.printList(list.size()); //current 의 getter 가 필요하다.
    }

    void printList(int size) {
        //static method
        System.out.println("성적출력이");



        for (int i = 0; i < size; i++) {
            Exam exam = list.get(i);
            int kor = exam.getKor();//exam.kor;
            int eng = exam.getEng();
            int math = exam.getMath();
            int total = exam.total();
            float avg = exam.avg();
            // int total = kor + eng + math 이뚀한 캡슐화에맞지 않다 다른 클래스의 속성을 사용하니
            //float avg = total / 3.0f;


            System.out.printf("kor : %d | eng : %d | math : %d \n", kor, eng, math);
            System.out.printf("total : %d | avg : %6.2f\n", total, avg);
        }
    }




}
