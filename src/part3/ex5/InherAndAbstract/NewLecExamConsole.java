package part3.ex5.InherAndAbstract;

import part3.ex4.UIcodeSeparate.Exam;
import part3.ex4.UIcodeSeparate.ExamConsole;

import java.util.Scanner;

public class NewLecExamConsole extends ExamConsole {

    @Override
    protected void onInput(Exam exam) {
        NewlecExam newlecExam = (NewlecExam) exam;
        Scanner sc = new Scanner(System.in);
        int com;
        do {
            System.out.printf("com : ");
            com = sc.nextInt();
            if (com < 0 || 100 <com)
                System.out.printf("com : wrong");
        } while (com < 0 || 100 < com);

        newlecExam.setCom(com);
    }

    @Override
    protected void onPrint(Exam exam) {
        NewlecExam newlecExam = (NewlecExam)exam; //형식변환을 해줘야한다.
        int com = newlecExam.getCom();
        System.out.printf("com : %d \n",com);
    }

    @Override
    protected Exam makeExam() {

        return new NewlecExam();


    }
}