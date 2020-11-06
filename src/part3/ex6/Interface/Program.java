package part3.ex6.Interface;

public class Program {
    // A 와 B 의 결합력 높다.
    // 내부적으로 실행하는 쪽은 B를 사용한적 없지만 생성되서 실행된다.
    // A가 사라져야 B가 사라진다. => 결합력 짱

    public static void main(String[] args){
        // 배터리를 구현못했다고 핸드폰을 구현 못하는 것이 옳지 않은 것처럼
        // 결합력을 낮춰주는 것을 진행한다.
        A a = new A(); //   핸드폰 구현
        B b= new B(); // 배터리 구
        a.setX(b); //a와 b의 결합



        a.print();
    }
}
