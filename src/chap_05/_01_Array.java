package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + "하나");
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeChandler + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println("주세요");

        String[] coffees = new String[4];
        //크기 4개의 똑같은 스트링형을 가지는 배열을 만든다.

        //두번째 방법
        //String coffees[] = new String[4];
        //대괄호 위치가 다르다.

//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라뗴";
//        coffees[3] = "카푸치노";

        //세번째 방법
        String[] coffees_1 = new String[] {"아메리카노", "카페모카", "라떼"};

        String[] coffees_2 = {"아메리카노", "카페모카", "라떼"};

        System.out.println(coffees[0] + "하나");
        System.out.println(coffees[1] + "하나");

        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        double[] d = new double[] {10.0, 11.2 , 13.5};
        boolean[] b = {true, true, false};










    }
}
