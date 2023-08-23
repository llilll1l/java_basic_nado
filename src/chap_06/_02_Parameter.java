package chap_06;

public class _02_Parameter {

    public static void power(int number) { //Parameter, 매개변수
        //전달값이 있는 메소드
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }

    public static void  powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] arg ) {
        power(2);
        power(3);

        powerByExp(2, 3);
        powerByExp(3, 0 );
    }
}
