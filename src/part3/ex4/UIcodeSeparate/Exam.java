package part3.ex4.UIcodeSeparate;

public class Exam {
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

    public int total() {
        return kor+eng+math;
    }

    public float avg() {
        return total()/3.0f;
    }
}
