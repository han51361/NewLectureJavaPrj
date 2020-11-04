package part3.ex5.InherAndAbstract;

import part3.ex4.UIcodeSeparate.Exam;
import part3.ex4.UIcodeSeparate.ExamConsole;

public class NewLecExamConsole extends ExamConsole {

    @Override
    protected Exam makeExam() {

        return new NewlecExam();


    }
}