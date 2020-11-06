package part3.ex6.Interface;

public class A {
    private  X x; //b가 가지고있는 기능을 사용하려고 함

    public void setX(X x) {
        this.x = x;
    }

// 인터페이스를 new 선언하는 것은 없다.
    public A() {

    }

    public void print(){
        int total = x.total(); // total을 정의하지않는다면 print실행시
        // null point exception 발생

        System.out.printf("total is %d",total);
    }

}
