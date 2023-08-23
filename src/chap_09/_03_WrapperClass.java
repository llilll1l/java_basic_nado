package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        //래퍼 (Wrapper) 클래스 : int, double, float 같은 순수하게 값만 가지는 기본 자료형을 객체형태로 만들어서 사용하도록 만들어줌
        //int-> Integer, double -> Double 래퍼클래스 사용

        Integer i = 123;
        Double d = 1.0;
        Character c ='A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("-------------------------------");
        System.out.println(i.intValue());
        System.out.println(d.intValue());//실수를 int형번환
        System.out.println(c.charValue());

        System.out.println("-------------------------------");
        String s = i.toString();
        System.out.println(s);
        System.out.println(s.getClass());
        System.out.println(s.getClass().getName());

    }
}
