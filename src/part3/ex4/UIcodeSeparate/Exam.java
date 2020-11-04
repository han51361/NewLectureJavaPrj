package part3.ex4.UIcodeSeparate;

public abstract class Exam {
    int kor;
    int eng;
    int math;
    public Exam(){
        this(0,0,0);
    }


    public Exam(int kor, int eng, int math){
        this.kor =kor;
        this.eng = eng;
        this.math = math;
    }

    public int getKor(){
        //캡슐을 깨지 않기 위해 get 함를 만든다.
        //데이터 구조가 변경되지 않기 위해getter&setter 사용
        return kor;
    }

    public void setKor(int num){

       this.kor = num;


    }


    public int getEng() {


        return eng;
    }

    public int getMath() {


    return math;
    }

    public void setEng(int eng) {


      this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public abstract int total(); // 여기에서 abstract 를 안쓰면서 total을 구현해버리면
    //자식들이 별도로 넣어줘야하는 것들을 할 수 없다.

    protected  int onTotal(){
    //자식들에게만 공개하는 범위 protected 설정
            return kor+eng+math;
        }

    public abstract float avg();
}
