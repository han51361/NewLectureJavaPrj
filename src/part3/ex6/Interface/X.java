package part3.ex6.Interface;

public interface X {
    //보호모드도 쓰지않고 함수구현보호블록 사용 x 변수 선언 x
    //참조라는 것을 가능하게 한다
    // 인터페이스가 선언하고 있는 함수는 무조건 참조할 수 있다.
    int total(); // Interface는 정의만하는 것이지 구현을 하는 것이 아니다.
}
