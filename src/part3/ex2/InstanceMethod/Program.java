package part3.ex2.InstanceMethod;


import static part3.ex2.InstanceMethod.ExamList.*;

public class Program {

    public static void main(String[] args) {

        ExamList list = new ExamList();
        list.init();


        int menu;
        boolean keepLoop = true;

        while(keepLoop){

            menu= inputMenu();
            switch (menu){

                case 1 :
                    //inputList(list);
                    list.inputList();
                    break;
                case 2:
                    //printList(list);
                    list.printList();
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
