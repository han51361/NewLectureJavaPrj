package part3.ex5.Inheritance;

import part3.ex4.UIcodeSeparate.Exam;

public class NewlecExam extends Exam { //is A상속
    //Exam = 부모 class , NewlecExam = 자식 class
    private Exam exam;
    private int com;


    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    @Override
    public int total(){
                return super.total()+com;
    }

  @Override
    public float avg(){
        return total()/4.0f;
  }

}
