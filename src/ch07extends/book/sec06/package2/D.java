package ch07extends.book.sec06.package2;
// 다른 패키지

import ch07extends.book.sec06.package1.A;
public class D extends A {
    //생성자 선언
    public D() {
        // A 생성자 호출
        super();
    }

    //메소드 선언
    public void method1() {
        // A 필드값 변경
        this.field = "value";
        // A 메소드 호출
        this.method();
    }
    // 상속을 통해서 사용 가능

    //메소드 선언
    public void method2() {
//        A a = new A();  //  안됨
//        a.field = "value";  //  안됨
//        a.method();  //  안됨
    }
    // 직접 객체 생성해서 사용하는 것은 안됨
}
