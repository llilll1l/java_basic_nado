package chap_06;

import javax.sound.midi.Soundbank;

public class _07_VariableScope {

    public static void methodA() {
        //System.out.println(number);  main메소드에서 선언된 number는 사용 불가
    }

    public static void methodB() {
        int result = 1;
    }

    public static void main(String[] args) {
        int number = 3;
       // System.out.println(result); 메소드 B 에서 만든 변수 사용 분가

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i); for문에서 선언된 i 는 for 문 벗어나면 사용 불가

        //중괄호 범위 안에서 선언된 것은 그 중괄호의 범위 안에서만 사용될 수 있다.
    }
}
