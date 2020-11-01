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




    public Exam get(int i) {
        return this.exams[i];
    }




    public void add(Exam exam) {
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

        public ExamList(int size){ // aggregation has A 관계
        // 전체와 부분이 부분의 연관관계를 맺으며 동일한 생명주기를 갖지 않는다.
        // 생성자 오버로드
        exams = new Exam[size];
        current = 0;
        }

    public int size() {


        return current;
    }
}

