package chap_07;

import java.util.Random;

public class _11_Package {
    //패키지 : 서로 연관된 클래스들 끼리 묶어둠
    //패키지 (램덤 클래스 사용)

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); //0이상~10미안의 정수형 값 반환
        System.out.println("랜덤 실수 : " + random.nextDouble()); //0.0 이상 1.0 미만의 실수값
        //System.out.println("랜덤 실수 (범위) : " + random.nextDouble(10.0)); 안됨
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble())); //5.0 이상 10.0 미만의 실수 값

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        //로또 번호를 랜덤으로 뽑으려면 ? 1~45
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
        //nextInt(45) : 0 이상 45 미만의 수
        //nextInt(45) + 1 : 1이상 45 이하의 수

    }


}
