package part3.ex5.Inheritance;

public class Program {

    public static void main(String[] args){

        //1.compile -> exam.class
        //2.압축 -> exam.zip
        //3.jar -> exam.jar
        NewlecExam exam = new NewlecExam(); // 인스턴스 메소드 실행시 본인의 객체만 생성되는 것이 아닌 super 클래스도 생성된다.
        exam.setEng(10);
        exam.setKor(10);
        exam.setMath(10);
        exam.setCom(10);
        System.out.println(exam.total()); //
    }


}
