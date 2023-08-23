package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        //제네릭 클래스

        CoffeeByNumber c1 = new CoffeeByNumber(33); //대기 번호 33번으로 생성
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("--------------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("--------------------------------");

        //int c3Name = c3.name; int형을 require 하는데 provide 타입은 Object형이라 에러.. 이것을 해결하기 위해서는 제네릭이 필요.. 하지만 아직은 안해봄
        int c3Name = (int) c3.name;
        System.out.println(c3Name);

        System.out.println("--------------------------------");
        //제네릭 클래스 실습
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();

        System.out.println("--------------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("서장훈"));
        c8.ready();

        System.out.println("--------------------------------");
        orderCoffee("김영철");
        orderCoffee(36);

        orderCoffee("김희철", "아메리카노");
        orderCoffee(37, "라떼");


    }

    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println(coffee + " 준비 완료 : " + name);
    }

}
