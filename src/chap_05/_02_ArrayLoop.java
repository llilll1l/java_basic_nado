package chap_05;

import javax.sound.midi.Soundbank;

public class _02_ArrayLoop {
    public static void main(String[] args) {

    //for문, for each문 실습
        String[] coffees = {"americano", "cafe moca", "late", "cafeccino"};

        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나");
        }

        System.out.println("주세요");

        //배열의 길이를 이용한 순회

        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        //enhanced for( for-each) 반복문
        //처음부터 끝까지 순회
        for (String coffee : coffees) {
            System.out.println(coffee + "하나");
        }

        for (String coffee :
                coffees) {
            System.out.println(coffee + " 하나");
        }

        System.out.println("주세요");



    }
}
