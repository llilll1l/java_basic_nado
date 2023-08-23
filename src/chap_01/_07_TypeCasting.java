package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변환  TypeCasting
        //정수형에서 실수형으로
        //실수형에서 정수형으로

        // int score = 93 + 98.8; 실수형 데이터를 정수형으로 변환한 뒤 연산 가능

        //int to float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float)score); //93.0
        System.out.println((double) score); //93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); //93 , 소수점은 버려짐
        System.out.println((int)score_d); //98 , 소수점은 버려짐

        //정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score); //191

        score_d = 93 + 98.8; // 93이 자동으로 93.0으로 double형 변환됨
        System.out.println(score_d);

        //변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0으로 자동 변환

        //중요
        //int -> long -> float -> double로 갈 때 자동 형변환 됨

        int convertedScoreInt = (int)score_d; //191.8 -> 191
        //더 작은 범위로 갈 떄는 수동으로 형 변환을 해 줘야한다
        //double -> float -> long -> int 수동 형변환

        //슷자를 문자열로
        String s1 = String.valueOf(93);
        //string이란 클래스가 제공해주는 valueof라는 기능을 이용하여 숫자를 문자열로 바꿔준다.
        s1 = Integer.toString(93);
        //Integer클래스에서 제공해주는 toString이라는 기능 이용하여 문자를 숫자로 형 변환
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        //Integer클래스에서 제공하는 parseInt 메소드 이용하여 "93"문자열을 파싱하여 정수로 변환
        System.out.println(i);

        //실수형을 더블로
        double d = Double.parseDouble("98.8");
        System.out.println(d); //98.8

        int error = Integer.parseInt("자바");


    }
}
