package chap_06;

public class _05_Overloading {
    //메소드 오버로딩 -> 이름 같은 메소드를 여러개 만들어서 선언할수 있다.
    //전달값의 자료형, 개수 다른 메소드.
    //반환형 부분만 다른것은 정의 불가 , 파라미터 값의 자료형이나 개수가 달라야 중복 정의 가능
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,3));

    }
}
