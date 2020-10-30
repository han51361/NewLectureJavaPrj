package part3.ex1.Capsulation;

import static part3.ex1.Capsulation.ExamList.*;

public class Program {

    public static void main(String[] args) {

        ExamList list = new ExamList();
        ExamList.init(list);


        int menu;
        boolean keepLoop = true;

        while(keepLoop){

            menu= inputMenu();
            switch (menu){

                case 1 :
                    inputList(list);
                    break;
                case 2:
                    printList(list);
                    break;
                case 3:
                    System.out.println("The end");
                    keepLoop = false;
                    break;
                default:
                    System.out.println("Wrong Input");
            }

        }
    }
}
