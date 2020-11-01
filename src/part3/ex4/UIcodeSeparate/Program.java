package part3.ex4.UIcodeSeparate;

import java.util.Scanner;

public class Program {
     // 데이터 구조에 대해서는 습관적으로 private
    // 서비스 해야할 것들에 대해서는 public
    public static void main(String[] args) {

        ExamConsole list = new ExamConsole();
        // 생성자는 다시 생성하지 않는다.

        Scanner sc = new Scanner(System.in);

        int menu;
        boolean keepLoop = true;

        while(keepLoop){
            System.out.println("수를 입력해주세요");
            menu = sc.nextInt();
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
                    break;
            }

        }
    }
}
