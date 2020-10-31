package part3.ex4.UIcodeSeparate;



;

import java.util.Scanner;

public class ExamList {

    //외부변수의 변경으로 인해 파일이 에러가 나는것을 방지 => capsulation
    //파라미터 전달이 아닌, 인스턴스를 통해 호춣을해야 편하다
    //인스턴스를 사용해야 속성,값 등을 이용하여 행동 지시
    // ex . list.inputList() (o) ExamList.inputLisy(list) (x)
    // list 야 list input 해
    // static method vs instance method
    /*
    public static void inputList(ExamList list){
    list.exams[list.current] = new Exam();
    }
    vs
    public void inputList(){
    //여기선 받을 parameter 가 없기에 묵시적으로 this 로 받는다.
    this.exams[this.current] = new Exam();
    }


     */
    Exam[] exams;
    private int current;


    void printList() {
        this.printList(current);
    }

    void printList(int size) {
        //static method
        System.out.println("성적출력이");



        for (int i = 0; i < size; i++) {
            Exam exam = this.get(i);
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

    private Exam get(int i) {
        return this.exams[i];
    }


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
           add(exam);
        }

    private void add(Exam exam) {
        Exam[] exams = this.exams;
        int size = this.current;

        if (exams.length == size) {
            //  1.크기가 5개 정도 더 큰 새로운
            Exam[] temp = new Exam[size + 5];
            //2. 값을 이주시키기
            for (int i = 0; i < size; i++)
                temp[i] = exams[i];
            //3.list.exmas가 새로만든 temp
            this.exams = temp;
        }

        this.exams[this.current] = exam;
        this.current++;

        System.out.printf("성적 기입 완료 \n");
    }

    static int inputMenu(){
         int k =0;
         return k;
        }




        public ExamList() {
             // 얘는 객체를 초기화 하는 역할 , 생성자의 역할로서는 적절치 않다.
            // 기본 생성자를 컴파일러가 자동으로 만들어준다.
           this(3); //code 중복을 막음
        }

        public ExamList(int size){
        // 생성자 오버로드
        exams = new Exam[size];
        current = 0;
        }
    }

