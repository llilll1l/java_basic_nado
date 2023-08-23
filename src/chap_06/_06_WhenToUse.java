 package chap_06;

public class _06_WhenToUse {
    // 메소드가 필요한 이유
    // 메소드내 또 다른 메소드를 호출할수도 있다.
    public static int getPower ( int number) {
        return getPower(number,2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(getPower(2,2));

        System.out.println(getPower(3,3));

        System.out.println(getPower(4,4));

    }
}
